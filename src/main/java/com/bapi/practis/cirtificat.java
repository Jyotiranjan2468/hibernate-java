package com.bapi.practis;

import javax.persistence.Embeddable;

@Embeddable
public class cirtificat {
	private String course;
	private String duration;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public cirtificat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cirtificat(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	

}
