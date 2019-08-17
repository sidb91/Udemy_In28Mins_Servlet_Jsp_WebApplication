package com.servlet;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if("Sid".equals(user) && "password".equals(password)) {
			return true;
		}
		return false;
	}

}
