package com.sunbeam.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sunbeam.entities.User_basic_details;

public interface UserbdDao extends JpaRepository<User_basic_details, Long> {
	@Query("SELECT CASE WHEN COUNT(u)>0 THEN TRUE ELSE FALSE END FROM User_basic_details u WHERE "
			+ "u.email = :email")
	boolean existsByEmail(@Param("email") String email);
	
	public Optional<User_basic_details> findByEmailAndPassword(String email, String password);

} 
