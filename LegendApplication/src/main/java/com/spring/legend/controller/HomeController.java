package com.spring.legend.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.legend.model.Organization;
import com.spring.legend.model.User;
import com.spring.legend.services.OrganizationService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private OrganizationService organizationService;
    
	@Autowired(required=true)
	@Qualifier(value="organizationService")
	public void setOrganizationService(OrganizationService os){
	        this.organizationService = os;
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "login";
	}
/*	@RequestMapping(value = "/addOrganization", method = RequestMethod.GET)
	public String addOrganization() {
		return "orgcontactinfo";
	}
*/	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signup() {
		System.out.println("isnisde signup");
		ModelAndView model = new ModelAndView("signup");
		model.addObject("command", new User());
		model.addObject("organization",organizationService.listOrganizations());
		return model;
	}
	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public ModelAndView organization() {
		ModelAndView model = new ModelAndView("organization");
		model.addObject("command", new Organization());
		return model;
	}
}
