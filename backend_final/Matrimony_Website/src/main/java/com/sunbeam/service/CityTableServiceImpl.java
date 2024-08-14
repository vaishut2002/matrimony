package com.sunbeam.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.CityTableDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.City;
import com.sunbeam.entities.CityTable;

@Service
@Transactional
public class CityTableServiceImpl implements CityTableService {
	@Autowired
	private CityTableDao cityTableDao;

	@Override
	public ApiResponse addCity() {
		// TODO Auto-generated method stub
		for (City city : City.values()) {
			if(!cityTableDao.existsByCity(city)) {
				CityTable newCity = new CityTable(city);
				cityTableDao.save(newCity);
			}
		}
		return new ApiResponse("City added");
	}
	
	
}
