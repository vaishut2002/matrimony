package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.service.Marital_StatusServiceImpl;

@RestController
@RequestMapping("/addMaritalStatus")
public class Marital_StatusController {

	@Autowired
	private Marital_StatusServiceImpl marital_StatusService;
	
	@PostMapping
	public ResponseEntity<?> addAllMaritalStatus(){
		System.out.println("In add MaritalStatus...");
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(marital_StatusService.addMaritalStatus());
	}
}
