package com.naissur.section14;

// import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	// private LinkedHashMap<String, String> countryOptions;
	
	// no-args constructor
	public Student() {
		// populate country options: used ISO country code
		/*countryOptions = new LinkedHashMap<>();
		countryOptions.put("RU", "Russian Federation");
		countryOptions.put("UA", "Ukraine");
		countryOptions.put("KZ", "Kazakhstan");
		countryOptions.put("BL", "Belorussia");*/
	}

	// getter and setter method for the fields
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/
}
