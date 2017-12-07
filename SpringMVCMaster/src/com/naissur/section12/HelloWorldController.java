package com.naissur.section12;

import org.springframework.stereotype.Controller;
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
}