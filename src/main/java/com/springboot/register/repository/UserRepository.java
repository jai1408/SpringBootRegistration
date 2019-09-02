package com.springboot.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.register.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
