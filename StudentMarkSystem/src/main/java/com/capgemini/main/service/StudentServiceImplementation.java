package com.capgemini.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.StudentDaoImplementation;
import com.capgemini.main.entities.Student;

@Service
public class StudentServiceImplementation implements StudentServiceInterface{

	@Autowired
	StudentDaoImplementation studentDao;
	@Override
	public boolean updateStudentDetails(Student student) {
		studentDao.save(student);
		return true;
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> list = studentDao.findAll();
		if(list.isEmpty())
		{
			return null;
			
		}
		else {
			return list;
		}
	}
	
	
}
