package com.capg.beans;

public class Courses {
	private int cId;
	private String cName;
	private int duration;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Courses [cId=" + cId + ", cName=" + cName + ", duration=" + duration + "]";
	}
	
	
}
