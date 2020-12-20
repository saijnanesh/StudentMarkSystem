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
	private String marksId;
	private int sanskritMarks;
	private int englishMarks;
	private int mathsMarks;
	private int physicsMarks;
	private int chemistryMarks;
	
	
	
	
	
	 
	
	

	public String getMarksId() {
		return marksId;
	}
	public void setMarksId(String marksId) {
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
	public Marks(String marksId, int sanskritMarks, int englishMarks, int mathsMarks, int physicsMarks,
			int chemistryMarks) {
		super();
		this.marksId = marksId;
		this.sanskritMarks = sanskritMarks;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
	}
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Marks [marksId=" + marksId + ", sanskritMarks=" + sanskritMarks + ", englishMarks=" + englishMarks
				+ ", mathsMarks=" + mathsMarks + ", physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks
				+ "]";
	}
	
	
	

}
