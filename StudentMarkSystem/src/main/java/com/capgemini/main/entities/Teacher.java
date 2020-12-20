package com.capgemini.main.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table
@Entity
public class Teacher {
	
	@Id
	private int employeeId;
	private String name;
	private long mobileNumber;
	private String subject;
	
	
	
//	
//	
//@OneToMany(targetEntity = Student.class , cascade = CascadeType.ALL)
//@JoinColumn(name="listOfStudents", referencedColumnName="employeeId")
//private List<Student> listOfStudents = new ArrayList<>();
//
//	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
//	public List<Student> getListOfStudents() {
//		return listOfStudents;
//	}
//	public void setListOfStudents(List<Student> listOfStudents) {
//		this.listOfStudents = listOfStudents;
//	}
//	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
	
	
	
	
	
//	public Section getSection() {
//		return section;
//	}
//	public void setSection(Section section) {
//		this.section = section;
//	}
//	
	
	
	
	
	
	public Teacher(int employeeId, String name, long mobileNumber, String subject
			//, Section section,	List<Student> listOfStudents
			) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.subject = subject;
		//this.section = section;
//		this.listOfStudents = listOfStudents;
	}
	public Teacher() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Teacher [employeeId=" + employeeId + ", name=" + name + ", mobileNumber=" + mobileNumber + ", subject="
				+ subject + "]";
	}
	
	
	
	
}
