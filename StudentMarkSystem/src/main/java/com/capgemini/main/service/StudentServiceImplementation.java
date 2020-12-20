package com.capgemini.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.StudentDao;
import com.capgemini.main.dao.TeacherDao;
import com.capgemini.main.entities.Student;

@Service
public class StudentServiceImplementation implements StudentServiceInterface{

	@Autowired
	StudentDao studentDao;
	@Autowired
	TeacherDao teacherDao;
	
	
	@Override
	public boolean addStudentDetails(Student student) {
		
		if(studentDao.existsById(student.getTaggedId()))
			return false;
		else
		{
			studentDao.save(student);
			return true;
		}
	}
	
	
	
	@Override
	public List<Student> getAllStudents(int id) {
		List<Student> list = new ArrayList<>();
		studentDao.findByTeacherEmployeeId(id).forEach(list :: add);
		if(list.isEmpty())
		{
			return null;
			
		}
		else {
			return list;	
			}
	}



	@Override
	public Optional<Student> getStudent(int id) {
		return studentDao.findById(id);
	}



	@Override
	public Boolean updateStudentDetails(Student student,int id) {
		if(student.getTaggedId() == id)
		{
			studentDao.save(student);
			return true;
		}
		else
		{
			return false;
		}
	}
	}
	
	

