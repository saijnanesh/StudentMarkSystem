package com.capgemini.main.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class Student {
	
	@Id
	private int taggedId;
	private int rollNumber;
	private String name;
	private long phoneNumber;
	
	
	@OneToOne
	private Marks marksOfEachStudent;
	
@ManyToOne
private Teacher teacher;
	
	
	public Student(int taggedId, int rollNumber, String name, long phoneNumber, String marksId, int teacherId) {
	super();
	this.taggedId = taggedId;
	this.rollNumber = rollNumber;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.marksOfEachStudent = new Marks(marksId,0,0,0,0,0);
	this.teacher = new Teacher(teacherId, "",0 ,"");
}
	
	
	
	public int getTaggedId() {
		return taggedId;
	}
	public void setTaggedId(int taggedId) {
		this.taggedId = taggedId;
	}
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
	public Marks getMarksOfEachStudent() {
		return marksOfEachStudent;
	}
	public void setMarksOfEachStudent(Marks marksOfEachStudent) {
		this.marksOfEachStudent = marksOfEachStudent;
	}
	
	
	
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student() {
		super();
		}
	
	@Override
	public String toString() {
		return "Student [taggedId=" + taggedId + ", rollNumber=" + rollNumber + ", name=" + name + ", phoneNumber="
				+ phoneNumber + ", marksOfEachStudent=" + marksOfEachStudent + "]";
	}
	
	
	
	
	
	
	
	
	

}
