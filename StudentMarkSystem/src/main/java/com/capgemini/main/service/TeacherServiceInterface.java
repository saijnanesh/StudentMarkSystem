package com.capgemini.main.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.main.entities.Teacher;

public interface TeacherServiceInterface {
	
	 boolean addTeacherDetails(Teacher teacher);
	 List<Teacher> getAllDetails();
	Optional<Teacher> getTeacherDetails(int id);
}
