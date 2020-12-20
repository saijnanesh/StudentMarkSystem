package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entities.Marks;

public interface MarksServiceInterface {
	boolean addStudentMarks(Marks marks,int id);
	List<Marks> getAllMarks();

}
