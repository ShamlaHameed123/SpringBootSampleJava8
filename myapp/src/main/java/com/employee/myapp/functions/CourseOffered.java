package com.employee.myapp.functions;

import java.util.List;

import com.employee.myapp.model.Course;

@FunctionalInterface
public interface CourseOffered {
	
	public List<String> checkCourseOfferedStudent(List<String> courses);

}
