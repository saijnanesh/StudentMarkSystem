package com.capgemini.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.MarksDao;
import com.capgemini.main.entities.Marks;
import com.capgemini.main.entities.Student;


@Service
public class MarksServiceImplementation implements MarksServiceInterface{

	
	
	@Autowired
	private  MarksDao marksDao;
	
	
	
	@Override
	public boolean addStudentMarks(Marks marks,int id) {

		List<Student> list = marksDao.getList(id);
		System.out.println(list);
		int i=id-1;
		String name = list.get(i).getName()+list.get(i).getTaggedId();
	
		if(!marks.getMarksId().contentEquals(name))
		{
			return false;
		}
		else
		{
			marksDao.save(marks);
			return true;
		}
	}



	@Override
	public List<Marks> getAllMarks() {
		List<Marks> list = new ArrayList<>();
		marksDao.findAll().forEach(list :: add);
		if(list.isEmpty())
		{
			return null;
		}
		else {
			return list;
		}
	}

}
