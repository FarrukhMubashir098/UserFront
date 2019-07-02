package com.UserFront.service.UserServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserFront.dao.UserDao;
import com.UserFront.domain.User;
import com.UserFront.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
@Autowired
   private UserDao userDao;

@Override
public void save(User user) {
	userDao.save(user);
	
}

@Override
public User findByUsername(String username) {
	
	return userDao.findByUserName(username);
}

@Override
public User findByEmail(String email) {
	// TODO Auto-generated method stub
	return userDao.findByEmail(email);
}

@Override
public boolean checkUserExist(String username, String email) {
	
	if(checkUsernameExist(username) || checkEmailExist(email)) {
		return true;
	}
	return false;
	
}

@Override
public boolean checkUsernameExist(String username) {
	// TODO Auto-generated method stub
	if(userDao.findByUserName(username) != null) {
		return true;
	}
	return false;
}

public boolean checkEmailExist(String email) {
	// TODO Auto-generated method stub
	if(userDao.findByEmail(email) != null) {
		return true;
	}
	return false;
}

}
