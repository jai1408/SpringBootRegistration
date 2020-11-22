package com.citi.register.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.citi.register.model.Role;
import com.citi.register.model.User;
import com.citi.register.repository.RoleRepository;
import com.citi.register.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    
	
	@Override
	public void save(User user) {

		Role role1 = new Role(1,"admin");
		Role role2 = new Role(2,"user");
		roleRepository.save(role1);
		roleRepository.save(role2);
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public void saveRole(Role role) {
		roleRepository.save(role);
	}
}
