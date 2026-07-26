package com.amazon.beans;

public class Student {
	private String name;
	private String course;
	private int fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public void displayDetailsInfo()
	{
		System.out.println("Student [name=" + name + ", course=" + course + ", fees=" + fees + "]");

	
	}
	

}
