package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.ReligionDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Religion;
import com.sunbeam.entities.Religions;



@Service
@Transactional
public class ReligionServiceImpl implements ReligionService{
	@Autowired
	private ReligionDao religionDao;

	@Override
	public ApiResponse addReligion() {
		// TODO Auto-generated method stub
		for (Religions religion : Religions.values()) {
			if(!religionDao.existsByReligion(religion)) {
				Religion newReligion = new Religion(religion);
				religionDao.save(newReligion);
			}
		}
		return new ApiResponse("Religion added");
	}
	
	

}
