package com.UserFront.service;

import com.UserFront.domain.User;

public interface UserService {

	
	void save(User user);
	User findByUsername(String username);
	User findByEmail(String email);
	boolean checkUserExist(String username , String email);
	boolean checkUsernameExist(String username);
	boolean checkEmailExist(String email);

}
