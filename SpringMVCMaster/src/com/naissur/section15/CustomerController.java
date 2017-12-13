package com.naissur.section15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/section15")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute(new Customer());
		return "section15/customer-form";
	}
}
