package com.naissur.section13;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldControllerSec13 {
	// need a controller method to show initial HTML form
	@RequestMapping("/showFormSec13")
	public String showFormSec13() {
		return "section13/helloworld-form-sec13";
	}
	
	// need a controller method to read form data
	// and add data to the model
	@RequestMapping("/processFormSec13")
	public String processFormSection13(
			@RequestParam("studentName") String theName,
			Model model) {
		
		// capitalize the value of request parameter
		theName = theName.toUpperCase();
		
		// create the message
		String message = "Hi there, " + theName;
		
		// add message to the model
		model.addAttribute("message", message);				
		
		return "section13/helloworld-sec13";
	}
}
