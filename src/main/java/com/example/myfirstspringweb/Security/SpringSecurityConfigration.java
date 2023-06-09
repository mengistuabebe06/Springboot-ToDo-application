package com.example.myfirstspringweb.Security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfigration {
	
//	InMemoryUserDetailsManager detailsManager1;
//	InMemoryUserDetailsManager(UserDetails... users);
	@Bean
	public InMemoryUserDetailsManager createUserDetailManager() {
		
		Function<String, String> passwordEncoder= input -> passwordEncoder().encode(input);
		
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
				.username("menge")
				.password("1234")
				.roles("USER","ADMIN")
				.build();
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
 