package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entities.Student;

public interface StudentServiceInterface {
	public boolean updateStudentDetails(Student student);
	List<Student> getAllStudents();
}
