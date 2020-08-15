package com.swaggerExample.springdocumentation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swaggerExample.springdocumentation.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
