package com.naissur.section14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/section14")
public class StudentController {
	// the method to display form
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// create a student object
		Student student = new Student();
		// add student object to the model
		model.addAttribute("student", student);
		return "section14/student-form";
	}
	
	// the method for the form processing
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
		return "section14/student-confirmation";
	}
}