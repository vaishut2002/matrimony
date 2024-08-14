package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.service.ZodiacSignTableServiceImpl;

@RestController
@RequestMapping("/addZodiacSign")
public class ZodiacSignTableController {
	@Autowired
	private ZodiacSignTableServiceImpl zodiacSignTableService;
	
	@PostMapping
	public ResponseEntity<?> addAllZodiacSign(){
		System.out.println("In add ZodiacSign...");
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(zodiacSignTableService.addZodiacSign());
	}
}
