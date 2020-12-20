package com.capgemini.main.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;

@Repository
@Transactional
public interface StudentDao extends JpaRepository<Student, Integer>{
	
	//@Query("Select teacher from Teacher teacher where teacher.id= :id")
	public List<Student> findByTeacherEmployeeId(int id);
}
//String Qstr = "SELECT stock from RawSpecs stock WHERE stock.name = :name";
//from UserEntity userentity where userentity.login = :logIn