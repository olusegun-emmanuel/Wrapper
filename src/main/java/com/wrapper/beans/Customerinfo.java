package com.wrapper.beans;

public class Customerinfo {

	private String id;
	private String firstname;
	private String lastname;
	private String grade;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Customerinfo(){}
	
	public Customerinfo(String id, String firstname, String lastname, String grade) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.grade = grade;
	}
	
	
	
}
