package com.naissur.section12;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	// need a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "section12/helloworld-form";
	}
	
	// need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "section12/helloworld";
	}
	
	// new controller method to read form data and
	// add data to the model
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// convert the data to all caps
		name = name.toUpperCase();
		
		// create the message
		String result = "Yo!! " + name;
		
		// add message to the model
		model.addAttribute("message", result);		
		
		return "section12/helloworld";
	}
}