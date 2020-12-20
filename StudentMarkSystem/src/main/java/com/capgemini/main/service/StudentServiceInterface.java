package com.capgemini.main.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.main.entities.Student;

public interface StudentServiceInterface {
	public boolean addStudentDetails(Student student);
	List<Student> getAllStudents(int id);
	Optional<Student> getStudent(int id);
	public Boolean updateStudentDetails(Student student,int id);
}
