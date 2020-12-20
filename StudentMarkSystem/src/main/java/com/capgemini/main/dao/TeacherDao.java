package com.capgemini.main.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Integer> {
	@Query("Select student from Student student")
	public List<Student> findAllStudent();
	
}
