package com.employee.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.myapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
