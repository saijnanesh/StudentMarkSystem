package com.capgemini.main.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table
@Entity
public class Teacher {
	
	@Id
	@Column(name = "EmployeeId"  )
	private int employeeId;
	private String name;
	private long mobileNumber;
	private String subject;
	
	
	
	
	
	
	@OneToMany(targetEntity =Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name="listOfStudents", referencedColumnName="EmployeeId")
	private List<Student> listOfStudents = new ArrayList<>();
	
	
	
	
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
	
	
	
	public List<Student> getListOfStudents() {
		return listOfStudents;
	}
	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
	
	
	
	
	
	public Teacher(int employeeId, String name, long mobileNumber, String subject, List<Student> listOfStudents) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.subject = subject;
		this.listOfStudents = listOfStudents;
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
