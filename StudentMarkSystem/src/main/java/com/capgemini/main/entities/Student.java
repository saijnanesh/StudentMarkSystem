package com.capgemini.main.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class Student {
	
	@Id
	private int rollNumber;
	private String name;
	private long phoneNumber;
	private String section;
	
	@OneToMany
	private List<Marks> marksOfEachStudent;
	
	
	
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public List<Marks> getMarksOfEachStudent() {
		return marksOfEachStudent;
	}
	public void setMarksOfEachStudent(List<Marks> marksOfEachStudent) {
		this.marksOfEachStudent = marksOfEachStudent;
	}
	
	
	
	
	
	

}
