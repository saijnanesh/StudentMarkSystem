package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entities.Teacher;

public interface TeacherServiceInterface {
	
	 boolean addTeacherDetails(Teacher teacher);
	 List<Teacher> getAllDetails();
}
