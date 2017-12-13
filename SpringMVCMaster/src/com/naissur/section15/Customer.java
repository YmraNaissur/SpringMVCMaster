package com.naissur.section15;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	// instance variables
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	// no-args constructor
	
	public Customer() {
		/* NOP */
	}

	// getter and setter methods for the fields
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}