package com.employee.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.myapp.model.College;

public interface CollegeRepository extends JpaRepository<College, Integer>{

}
