package com.capgemini.main.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.main.entities.Marks;
import com.capgemini.main.entities.Student;

@Repository
@Transactional
public interface MarksDao extends JpaRepository<Marks, Integer>{
	@Query("Select student from Student student where student.taggedId=id")
	public List<Student> getList(int id);
}
