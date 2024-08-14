package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.service.ReligionServiceImpl;

@RestController
@RequestMapping("/addReligion")
public class ReligionController {
	@Autowired
	private ReligionServiceImpl religionService;
	
	@PostMapping
	public ResponseEntity<?> addAllReligion(){
		System.out.println("In add Religion...");
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(religionService.addReligion());
	}
}
