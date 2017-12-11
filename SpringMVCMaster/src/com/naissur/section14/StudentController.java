package com.naissur.section14;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/section14")
public class StudentController {
	
	@Value("#{countryOptions}")
	private LinkedHashMap<String, String> countryOptions;
	
	// the method to display form
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// create a student object
		Student student = new Student();
		// add student object to the model
		model.addAttribute("student", student);
		
		// add country options to the model
		model.addAttribute("countryOptions", countryOptions);
		
		return "section14/student-form";
	}
	
	// the method for the form processing
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Operating systems: " + student.getOperatingSystems());				
		return "section14/student-confirmation";
	}
}