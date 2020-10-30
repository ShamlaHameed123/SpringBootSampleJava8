package com.employee.myapp.dto;

import java.util.List;

import com.employee.myapp.model.College;
import com.employee.myapp.model.Course;

public class StudentRequestDto {
	
	private int rollNo;
	private String studentName;
	private College college;
	private List<Course> courses;
	
	public StudentRequestDto() {
		super();	
	}
	
	public StudentRequestDto(List<Course> courses) {
		this.courses = courses;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}



	

}
