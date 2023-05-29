package com.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.entity.User;
import com.registration.repository.Userrepository;

@Service
public class UserServiceImpl implements UserServiceI{
	@Autowired
	private Userrepository repository;
		
	@Override
	public void registerUser(User user) {
		repository.save(user);
		
	}

}
