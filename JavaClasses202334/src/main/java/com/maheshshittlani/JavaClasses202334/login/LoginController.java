package com.maheshshittlani.JavaClasses202334.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	AuthenticateService authenticateService;
	
	
	public LoginController(AuthenticateService authenticateService) {
		super();
		this.authenticateService = authenticateService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginView() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String doLogin(@RequestParam String email, @RequestParam String password, ModelMap model) {
		
		if(authenticateService.authenticate(email, password)) {
			model.put("email", email);
			model.put("password", password);
			return "dashboard";			
		}
		model.put("message", "Invalid email/password");
		return "login";
	}
}
