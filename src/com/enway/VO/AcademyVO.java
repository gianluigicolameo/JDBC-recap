package com.enway.VO;

import java.io.Serializable;

public class AcademyVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;

	private String academyCode;

	private String subject;

	private int numberOfStudents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcademyCode() {
		return academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public AcademyVO(int id, String academyCode, String subject, int numberOfStudents) {
		super();
		this.id = id;
		this.academyCode = academyCode;
		this.subject = subject;
		this.numberOfStudents = numberOfStudents;
	}

	@Override
	public String toString() {
		return "AcademyVO [id=" + id + ", academyCode=" + academyCode + ", subject=" + subject + ", numberOfStudents="
				+ numberOfStudents + "]";
	}
	
	
}
