package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.User_Religion_Details;

public interface UserrdDao extends JpaRepository<User_Religion_Details, Long> {
	
}
