package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.CasteDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Caste;
import com.sunbeam.entities.Castes;

@Service
@Transactional
public class CasteServiceImpl implements CasteService {
	@Autowired
	private CasteDao casteDao;
	
	@Override
	public ApiResponse addCastes() {
		// TODO Auto-generated method stub
		for(Castes caste : Castes.values()) {
			if(!casteDao.existsByCaste(caste)) {
				Caste newCaste = new Caste(caste);
				casteDao.save(newCaste);
			}
		}
		return new ApiResponse("Castes added");
	}

}
