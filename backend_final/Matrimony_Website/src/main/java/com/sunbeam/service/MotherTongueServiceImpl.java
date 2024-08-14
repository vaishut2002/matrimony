package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.MotherTongueDao;
import com.sunbeam.dto.ApiResponse;


import com.sunbeam.entities.MotherTongue;
import com.sunbeam.entities.MotherTongues;

@Service
@Transactional
public class MotherTongueServiceImpl implements MotherTongueService {
	@Autowired
	private MotherTongueDao motherTongueDao;

	@Override
	public ApiResponse addMotherTongue() {
		// TODO Auto-generated method stub
		for (MotherTongues motherTongue : MotherTongues.values()) {
			if(!motherTongueDao.existsByMotherTongue(motherTongue)) {
				MotherTongue newMotherTongue = new MotherTongue(motherTongue);
				motherTongueDao.save(newMotherTongue);
			}
		}
		return new ApiResponse("MotherTongue added");
	}
	
	
}
