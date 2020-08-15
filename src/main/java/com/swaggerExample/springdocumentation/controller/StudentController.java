package com.swaggerExample.springdocumentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swaggerExample.springdocumentation.model.Student;
import com.swaggerExample.springdocumentation.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@PostMapping("api/v1/user")
	public void postHello(@RequestBody Student student)
	{
		this.studentRepository.save(student);
	}
	
	@GetMapping("api/v1/view")
	public List<Student> getHello()
	{
	return studentRepository.findAll();
	}
	
	
	
}
