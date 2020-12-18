package com.capgemini.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.main.entities.Student;

@Repository
@Transactional
public interface StudentDaoImplementation extends JpaRepository<Student, Integer>{
	
//	@PersistenceContext
//	EntityManager entityManager;
//	
//	@Override
//	public boolean updateStudentDetails(Student student) {
//		entityManager.persist(student);
//		return true;
//	}
//	
	
}
