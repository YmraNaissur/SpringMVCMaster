package com.naissur.section13;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyControllerSec13 {
	// need a controller method to show initial HTML form
	@RequestMapping("/showFormSec13")
	public String displayTheForm() {
		return "section13/silly";
	}
}