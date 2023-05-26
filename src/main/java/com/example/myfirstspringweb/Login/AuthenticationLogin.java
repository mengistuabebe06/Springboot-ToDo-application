package com.example.myfirstspringweb.Login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationLogin {

	public boolean ahuthenicateLogin(String name, String password) {
		
		boolean isValidUserName= name.equalsIgnoreCase("mengistu");
		boolean isValidPass = password.equalsIgnoreCase("12345");
		
		return isValidUserName && isValidPass;
	}
}
