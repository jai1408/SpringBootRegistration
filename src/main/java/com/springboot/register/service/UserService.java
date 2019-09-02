package com.springboot.register.service;

import com.springboot.register.model.User;

public interface UserService {
	
	void save(User user);

    User findByUsername(String username);

}
