package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.User_Details;

public interface UserDetailsDao extends JpaRepository<User_Details, Long> {

}
