package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.Marital_StatusDao;
import com.sunbeam.dto.ApiResponse;


import com.sunbeam.entities.MaritalStatus;
import com.sunbeam.entities.Marital_Status;

@Service
@Transactional
public class Marital_StatusServiceImpl implements Marital_StatusService{
	
	@Autowired
	private Marital_StatusDao marital_StatusDao;

	@Override
	public ApiResponse addMaritalStatus() {
		// TODO Auto-generated method stub
		for(MaritalStatus maritalstatus : MaritalStatus.values()) {
			if(!marital_StatusDao.existsByMaritalStatus(maritalstatus)) {
				Marital_Status newMaritalStatus = new Marital_Status(maritalstatus);
				marital_StatusDao.save(newMaritalStatus);
			}
		}
		return new ApiResponse("MaritalStatus added");
	}
}
