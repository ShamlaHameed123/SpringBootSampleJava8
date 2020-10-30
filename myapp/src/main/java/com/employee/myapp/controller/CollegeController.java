package com.employee.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.myapp.model.College;
import com.employee.myapp.model.Course;
import com.employee.myapp.repository.CollegeRepository;
import com.employee.myapp.repository.CourseRepository;
import com.employee.myapp.service.StudentService;

@RequestMapping("/college")
@RestController
public class CollegeController {
	

	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/newCollege", method = RequestMethod.POST)
	public College createNewStudent(@RequestBody College newcollege) {
		College college = collegeRepository.save(newcollege);
		return college;
	}
	
	@RequestMapping(value = "/newCourse", method = RequestMethod.POST)
	public Course createNewCourse(@RequestBody Course newcourse) {
		Course course = courseRepository.save(newcourse);
		return course;
	}
	
	@RequestMapping(value="/getRecentCourse", method=RequestMethod.GET) 
	public List<String> getRecentCoursesOffered(){
		return studentService.getRecentCoursesOffered();
	}
	
}
