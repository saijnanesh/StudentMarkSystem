package com.capgemini.main.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.StudentDaoImplementation;
import com.capgemini.main.dao.TeacherDaoImplementation;
import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;

@Service
public class TeacherServiceImplementation implements TeacherServiceInterface{
	
	@Autowired
	TeacherDaoImplementation teacherDao;

	@Autowired
	StudentDaoImplementation studentDao;
	
	@Override
	public boolean addTeacherDetails(Teacher teacher) {
		teacherDao.save(teacher);
		return true;
	}

	@Override
	public List<Teacher> getAllDetails() {
		List<Teacher> list = teacherDao.findAll();
		List<Student> studentslist = studentDao.findAll();
		Iterator<Student> itr = studentslist.listIterator();
		while(itr.hasNext())
		{
			
			Student obj = itr.next();
			
		
		}
		
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list;
		}
	}
	
	
	

}
