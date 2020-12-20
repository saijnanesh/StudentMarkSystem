package com.capgemini.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.StudentDao;
import com.capgemini.main.dao.TeacherDao;
import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;

@Service
public class TeacherServiceImplementation implements TeacherServiceInterface{
	
	@Autowired
	TeacherDao teacherDao;

	@Autowired
	StudentDao studentDao;
	
	@Override
	public boolean addTeacherDetails(Teacher teacher) {
		List<Student> list = teacherDao.findAllStudent();
		teacherDao.save(teacher);
		//teacher.setListOfStudents(list);
		return true;
	}

	@Override
	public List<Teacher> getAllDetails() {
		List<Teacher> list = teacherDao.findAll();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list;
		}
	}

	@Override
	public Optional<Teacher> getTeacherDetails(int id) {
		Optional<Teacher> list = teacherDao.findById(id);
		if(!list.isPresent())
		{
			return null;
		}
		else
		{
			return list;
		}
	}
	
	
	

}
