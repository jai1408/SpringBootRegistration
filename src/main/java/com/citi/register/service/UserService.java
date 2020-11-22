package com.citi.register.service;

import com.citi.register.model.User;

public interface UserService {
	
	void save(User user);

    User findByUsername(String username);

}
