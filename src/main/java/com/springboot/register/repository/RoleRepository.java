package com.springboot.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.register.model.Role;
	
public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
