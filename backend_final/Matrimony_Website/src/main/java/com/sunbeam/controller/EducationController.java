package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.service.EducationServiceImpl;

@RestController
@RequestMapping("/addDegree")
public class EducationController {

	@Autowired
	private EducationServiceImpl educationService;
	
	@PostMapping
	public ResponseEntity<?> addAllDegree(){
		System.out.println("In add Degree...");
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(educationService.addDegree());
	}
}
