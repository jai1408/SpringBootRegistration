package com.citi.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citi.register.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
