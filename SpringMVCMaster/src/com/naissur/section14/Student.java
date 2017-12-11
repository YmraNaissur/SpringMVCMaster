package com.naissur.section14;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLang;
	private List<String> operatingSystems;
	private LinkedHashMap<String, String> favoriteLangOptions;
	private LinkedHashMap<String, String> operatingSystemsOptions;
	// private LinkedHashMap<String, String> countryOptions;
	
	// no-args constructor
	public Student() {
		// populate country options: used ISO country code
		/*countryOptions = new LinkedHashMap<>();
		countryOptions.put("RU", "Russian Federation");
		countryOptions.put("UA", "Ukraine");
		countryOptions.put("KZ", "Kazakhstan");
		countryOptions.put("BL", "Belorussia");*/
		
		// populate favorite languages: value, display label
		favoriteLangOptions = new LinkedHashMap<>();
		favoriteLangOptions.put("Java", "Java");
		favoriteLangOptions.put("Pascal", "Pascal");
		favoriteLangOptions.put("Basic", "Basic");
		favoriteLangOptions.put("JavaScript", "JavaScript");
		
		// populate operating systems: value, display label
		operatingSystemsOptions = new LinkedHashMap<>();
		operatingSystemsOptions.put("OS/2", "OS/2");
		operatingSystemsOptions.put("Android", "Android");
		operatingSystemsOptions.put("Bada", "Bada");
		operatingSystemsOptions.put("Linux", "Linux");
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

	public String getFavoriteLang() {
		return favoriteLang;
	}

	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}

	public LinkedHashMap<String, String> getFavoriteLangOptions() {
		return favoriteLangOptions;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}
	
	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/
}
