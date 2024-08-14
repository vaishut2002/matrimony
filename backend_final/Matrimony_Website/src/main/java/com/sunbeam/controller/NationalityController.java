package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.service.NationalityServiceImpl;

@RestController
@RequestMapping("/addNationality")
public class NationalityController {
	@Autowired
	private NationalityServiceImpl nationalityService;
	
	@PostMapping
	public ResponseEntity<?> addAllNationalities(){
		System.out.println("In add nationalities");
		
		return ResponseEntity.status(HttpStatus.CREATED).body(nationalityService.addNationalities());
	}
}
