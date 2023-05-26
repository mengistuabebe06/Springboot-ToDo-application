package com.example.myfirstspringweb.Login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

//	@Autowired
//	private AuthenticationLogin authenticationLogin;
// using constractor injection
	private AuthenticationLogin authenticationLogin;

	public LoginController(AuthenticationLogin authenticationLogin) {
		this.authenticationLogin = authenticationLogin;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());
	// localhost:8080/login?name=menge
//	@RequestMapping("/login")
//	public String login(@RequestParam String name, ModelMap model) {
////		model.put("name", name);
////		logger.debug("reuest form url",name);
////		logger.info("i wnat to pring on info",name);
////		model.put("age", age);
////		System.out.println("the name of the request"+ name);
//		return "login";
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goTOWellcome(ModelMap model) {
		model.put("name", "mengistu");
		return "wellcame";
	}
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String gotoLogin() {
//		return "login";
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String gotoWellcame(@RequestParam String name, @RequestParam String pass, ModelMap model) {
//
//		if (authenticationLogin.ahuthenicateLogin(name, pass) == true) {
//			model.put("name", name);
//			model.put("password", pass);
//			return "wellcame";
//		}
//		model.put("errorMessage", "Invalid username and password");
//		return "login";
//
//	}

}
