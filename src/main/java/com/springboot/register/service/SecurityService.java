package com.springboot.register.service;

import org.springframework.security.core.AuthenticationException;

public interface SecurityService {
	
	String findLoggedInUsername();

    void autoLogin(String username, String password) throws AuthenticationException, Exception;

}
