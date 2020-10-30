package com.employee.myapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.myapp.functions.CourseOffered;
import com.employee.myapp.repository.CourseRepository;

@Service
public class StudentService{
	
	@Autowired
	public CourseRepository courseRepository;
	
	
	public List<String> getRecentCoursesOffered() {
		

		
		CourseOffered getRecentCourses = (a) -> {
			a.stream().filter(c -> c.startsWith("p")).collect(Collectors.toList());
			return a;
		};
		
		List<String> courses = courseRepository.getAllCourseNames();
		return getRecentCourses.checkCourseOfferedStudent(courses);
	}
}
