package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.NationalitiesDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Nationalities;
import com.sunbeam.entities.Nationality;

@Service
@Transactional
public class NationalityServiceImpl implements NationalityService {
	
	
	@Autowired
	private NationalitiesDao nationalitiesDao;
	
	@Override
	public ApiResponse addNationalities() {
		// TODO Auto-generated method stub
		for(Nationalities nationality : Nationalities.values()) {
			if(!nationalitiesDao.existsByNationality(nationality)) {
				Nationality newNationality = new Nationality(nationality);
				nationalitiesDao.save(newNationality);
			}
		}
		return new ApiResponse("Nationalities added");
	}

}
