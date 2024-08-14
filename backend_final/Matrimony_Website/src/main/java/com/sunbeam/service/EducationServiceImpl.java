package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.EducationDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Degree;
import com.sunbeam.entities.Education;

@Service
@Transactional
public class EducationServiceImpl implements EducationService {
	@Autowired
	private EducationDao educationDao;

	@Override
	public ApiResponse addDegree() {
		// TODO Auto-generated method stub
		
		for(Degree degree : Degree.values()) {
			if(!educationDao.existsByDegree(degree)) {
				Education newDegree = new Education(degree);
				educationDao.save(newDegree);
			}
		}
		return new ApiResponse("Degree added");
	}
	
}
