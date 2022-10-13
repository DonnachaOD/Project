package com.ct414a1a.ug;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 * @author Donnacha O'Dwyer		2022
 *
 * Lecturer class to encapsulate standard fields
 * Name, Age, Date of Birth, ID, Username, List of taught modules
 * 
 */
public class Lecturer {
	
	public String name;			//Lecturer's name
	public int age;				//Lecturer's age in years
	public DateTime dateOfBirth;//Lecturer's date of birth
	public int id;				//Lecturer's ID
	public String username;		//Generate Username from name and age
	public List<Module> modulesTaught = new ArrayList<Module>();	//List of modules taught
	
	//Constructor
	public Lecturer(String name, DateTime dateOfBirth, int id) {
		this.name = name;
		this.age = Years.yearsBetween(dateOfBirth, DateTime.now()).getYears();
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		//generate username
		this.username = getUsername(this.name, this.age);
	}

	//Generate username from name and age
	private String getUsername(String name, int age) {
		return this.name = name.replaceAll("\\s", "") + Integer.toString(age);
	}
	
	//Get username
	public String getUsername() {
		return username;
	}
	
	//Add module to list of modules taught
	public void addModule(Module module) {
		this.modulesTaught.add(module);
	}
	
	//Overloaded Method add list of modules to list of modules
	public void addModule(ArrayList<Module> modules) {
		this.modulesTaught.addAll(modules);
	}
	
}
