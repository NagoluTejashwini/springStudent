package com.capg.beans;


public class Student {
	
	private int sId;
	
	private String sName;
	
	private int age;
	
	private int marks;
	
	private Courses course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, int age, int marks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
		this.marks = marks;
		
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", age=" + age + ", marks=" + marks + ", course=" + course
				+ "]";
	}
	
	
}
