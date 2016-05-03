package com.spring.legend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.legend.model.User;
import com.spring.legend.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Qualifier(value="userService")
	public void setUserService(UserService us){
	        this.userService = us;
	}
	
	
	@RequestMapping(value = "/user/signup", method = RequestMethod.POST)
	public String signUp(@ModelAttribute("command")User user,BindingResult result) {
		
		System.out.println("in user controller");
		String name = user.getName();
		String email = user.getEmail();
		String password = user.getPassword();
		String orgaization = user.getOrganization().getName();
		System.out.println("ijiii");
		userService.addUser(user);
		System.out.println("name :: " + name + " " +email+ " " +password+ " " +orgaization);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		System.out.println("inside login");
		String email = request.getParameter("email");
		String password= request.getParameter("password");
		User user = userService.validateUser(email, password);
		if(user!=null){
		 System.out.println("user :: " + user.getName() + "  email :: " + user.getEmail());
		}
		else {
			System.out.println("no user exist");
		}
			
		return "redirect:/";
	}

	
}
