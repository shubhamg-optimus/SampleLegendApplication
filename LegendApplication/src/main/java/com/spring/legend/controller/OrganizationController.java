package com.spring.legend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.legend.model.Organization;
import com.spring.legend.model.User;
import com.spring.legend.services.OrganizationService;

@Controller
public class OrganizationController {
    private OrganizationService organizationService;
    
	@Autowired(required=true)
	@Qualifier(value="organizationService")
	public void setOrganizationService(OrganizationService os){
	        this.organizationService = os;
	}
	
	@RequestMapping(value="/addOrganization", method = RequestMethod.POST)
	public String addOrganization(@ModelAttribute("command")Organization organization) {
		System.out.println("helo");
		ModelAndView model = new ModelAndView("signup");
		model.addObject("command", new User());
		organizationService.addOrganization(organization);
		return "redirect:signup";
    }
	
	
}
