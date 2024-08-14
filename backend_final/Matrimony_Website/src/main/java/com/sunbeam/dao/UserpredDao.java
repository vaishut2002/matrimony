package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.User_Preferences_Details;

public interface UserpredDao extends JpaRepository<User_Preferences_Details, Long> {

}
