package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	//Attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	//Getters and Setters
	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	//Constructors
	private Enrollment() {
	}
	
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		this.EnrollmentID = EnrollmentID;
	}
	
}
