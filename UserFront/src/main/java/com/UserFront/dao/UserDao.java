package com.UserFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.UserFront.domain.User;

public interface UserDao extends CrudRepository<User , Long> {

	User findByUserName(String userName);
	User findByEmail(String email);
	
}
