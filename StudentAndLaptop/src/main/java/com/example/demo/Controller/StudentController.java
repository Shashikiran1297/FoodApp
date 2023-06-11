package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.LaptopRepo;
import com.example.demo.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo stdRepo;
	
	@Autowired
	private LaptopRepo lapRepo;
	
	public Student pla
}
