package com.employee.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.myapp.model.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer>{
	
	@Query("select Name from course")
	public List<String> getAllCourseNames();

}
