package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.service.CasteServiceImpl;

@RestController
@RequestMapping("/addCastes")
public class CasteController {
	@Autowired
	private CasteServiceImpl casteService;
	
	@PostMapping
	public ResponseEntity<?> addAllCastes(){
		System.out.println("in add castes");
		
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(casteService.addCastes());
		
	}
}
