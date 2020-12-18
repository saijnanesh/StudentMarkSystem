package com.capgemini.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.main.entities.Teacher;

public interface TeacherDaoImplementation extends JpaRepository<Teacher, Integer> {
	
	
}
