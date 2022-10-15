package com.ct414a1a.ug;

import java.util.ArrayList;

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
	public ArrayList<Module> modulesTaught = new ArrayList<Module>();	//List of modules taught
	
	//Constructor
	public Lecturer(String name, DateTime dateOfBirth, int id) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		//generate Age
		setAge();
		//generate username
		setUsername(this.name, this.age);
	}
	
	/** 
	 * Generate username from name and age
	 * @param name
	 * @param age
	 * @return String
	 */
	private void setUsername(String name, int age) {
		//Remove spaces with replaceAll() and concatenate with age
		this.username = name.replaceAll("\\s", "") + Integer.toString(age);
	}
	
	/** 
	 * Add module to list of modules taught
	 * @param module
	 */

	public void addModule(Module module) {
		this.modulesTaught.add(module);
	}
	
	/** 
	 * Overloaded Method add list of modules to list of modules
	 * @param modules
	 */
	
	public void addModule(ArrayList<Module> modules) {
		this.modulesTaught.addAll(modules);
	}
	
	/** 
	 * Get Lecturer Name
	 * @return String
	 */
	public String getName() {
		return this.name;
	}
	
	/** 
	 * Set Lecturer Name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Set Lecturer Age
	 */
	public void setAge() {
		this.age = Years.yearsBetween(dateOfBirth, DateTime.now()).getYears();
	}

	/** 
	 * Get Lecturer Age
	 * @return int
	 */
	public int getAge() {
		return this.age;
	}
	
	/** 
	 * Get Lecturer Date of Birth
	 * @return DateTime
	 */
	public DateTime getDateOfBirth() {
		return this.dateOfBirth;
	}

	/** 
	 * Set Lecturer Date of Birth and age
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		setAge();
	}
	
	/** 
	 * Get Lecturer ID
	 * @return int
	 */
	public int getId() {
		return this.id;
	}

	/** 
	 * Set Lecturer ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/** 
	 * Get username
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set Lecturer Username
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/** 
	 * Get List of taught Modules
	 * @return List<Module>
	 */
	public ArrayList<Module> getModulesTaught() {
		return this.modulesTaught;
	}

	/** 
	 * Set List of taught Modules
	 * @param modulesTaught
	 */
	public void setModulesTaught(ArrayList<Module> modulesTaught) {
		this.modulesTaught = modulesTaught;
	}
	
	/** 
	 * Return String version of Lecturer
	 * @return String
	 */
	@Override
	public String toString() {
		return "{" +
			"\n		Name ='" + getName() + "'" +
			"\n		Age ='" + getAge() + "'" +
			"\n		Date Of Birth ='" + getDateOfBirth()+ "'" +
			"\n		ID ='" + getId() + "'" +
			"\n		Username ='" + getUsername() + "'";
	}
}
