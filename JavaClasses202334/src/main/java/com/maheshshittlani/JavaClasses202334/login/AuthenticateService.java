package com.maheshshittlani.JavaClasses202334.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
	public boolean authenticate(String email, String password) {
		boolean isValidEmail = email.equals("mahesh@gmail.com");
		boolean isValidPassword = password.equals("123");
		
		return isValidEmail && isValidPassword;
	}
}
