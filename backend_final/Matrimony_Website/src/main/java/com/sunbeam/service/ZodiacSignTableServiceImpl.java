package com.sunbeam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.ZodiacSignTableDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.ZodiacSignTable;
import com.sunbeam.entities.ZodiacSigns;



@Service
@Transactional
public class ZodiacSignTableServiceImpl implements ZodiacSignTableService{
	@Autowired
	private ZodiacSignTableDao zodiacSignTableDao;

	@Override
	public ApiResponse addZodiacSign() {
		// TODO Auto-generated method stub
		for (ZodiacSigns zodiacSigns : ZodiacSigns.values()) {
			if(!zodiacSignTableDao.existsByZodiacSign(zodiacSigns)) {
				ZodiacSignTable newZodiacSign = new ZodiacSignTable(zodiacSigns);
				zodiacSignTableDao.save(newZodiacSign);
			}
		}
		return new ApiResponse("ZodiacSign added");
	}
	
	
}
