package com.employee.myapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.myapp.model.Student;
import com.employee.myapp.repository.StudentRepository;

@RequestMapping("/students")
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@Autowired
//	private StudentService studentService;
//
//	@GetMapping("/students/{studentId}/courses")
//	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
//		return studentService.retrieveCourses(studentId);
//	}
//	
//	@GetMapping("/students/{studentId}/courses/{courseId}")
//	public Course retrieveDetailsForCourse(@PathVariable String studentId,
//			@PathVariable String courseId) {
//		return studentService.retrieveCourse(studentId, courseId);
//	}
	
	@PostMapping("/newStudent")
	public Student createNewStudent(@RequestBody Student newstudent) {
		Student student = studentRepository.save(newstudent);
		return student;
	}
	
	@RequestMapping(value="/getStudent/{id}", method=RequestMethod.GET) 
	public Student getStudent(@PathVariable int id){
		Optional<Student> optional = studentRepository.findById(id);
		return optional.map(name -> name).orElse(null);
	
	}
}
