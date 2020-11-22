package com.citi.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citi.register.model.Role;
	
public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
