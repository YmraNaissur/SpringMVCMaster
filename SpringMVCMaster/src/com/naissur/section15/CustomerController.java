package com.naissur.section15;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/section15")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "section15/customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid
							  @ModelAttribute("customer") Customer customer,
							  BindingResult result) {
		
		return result.hasErrors() ? "section15/customer-form" : "section15/customer-confirmation";
	}
}
