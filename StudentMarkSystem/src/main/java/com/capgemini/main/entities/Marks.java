package com.capgemini.main.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marks_seq")
	@SequenceGenerator(sequenceName = "marks_seq", allocationSize = 1, name = "marks_seq")
	private int marksId;
	private int sanskritMarks;
	private int englishMarks;
	private int mathsMarks;
	private int physicsMarks;
	private int chemistryMarks;
	
	
	
	
	
	
	
	

	public int getMarksId() {
		return marksId;
	}
	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}
	public int getSanskritMarks() {
		return sanskritMarks;
	}
	public void setSanskritMarks(int sanskritMarks) {
		this.sanskritMarks = sanskritMarks;
	}
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	
	
	

}
