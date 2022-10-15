package com.ct414a1a.ug;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 * @author Donnacha O'Dwyer		2022
 * 
 * Student class to encapsulate standard fields
 * Name, Age, Date of Birth, ID, Username, Course, List of Modules 
 *
 */
public class Student {

	public String name;		//Student's name
	public int age;			//Student's age in years
	public DateTime dateOfBirth;//Students date of Birth
	public int id;			//Student's student ID
	public String username; //Username from name and age
	public ArrayList<Course> courses = new ArrayList<Course>();	//Courses taken
	public ArrayList<Module> modules = new ArrayList<Module>();	//Modules taken
	
	//Constructor
	public Student(String name, DateTime dateOfBirth, int id) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		//generate age
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
		this.username = name.replaceAll("\\s", "") + Integer.toString(age);
	}
	
	/** 
	 * Add Module to list of modules
	 * @param module
	 */
	public void addModule(Module module) {
		this.modules.add(module);
	}
	
	/** 
	 * Overloaded Method add list of modules to list of modules
	 * @param modules
	 */
	public void addModule(ArrayList<Module> modules) {
		this.modules.addAll(modules);
	}
	
	/** 
	 * Add Course to list of courses
	 * @param course
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
		
	}
	
	/** 
	 * Overloaded Method add list of courses to list of courses
	 * @param courses
	 */
	public void addCourse(ArrayList<Course> courses) {
		this.courses.addAll(courses);
		for(Course course : courses){
			this.addModule(course.getModules());
		}
	}

	/** 
	 * Get Student Name
	 * @return String
	 */
	public String getName() {
		return this.name;
	}
	
	/** 
	 * Set Student Name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/** 
	 * Get Student Age
	 * @return int
	 */
	public int getAge() {
		return this.age;
	}
	
	/** 
	 * Set Student Age
	 */
	public void setAge() {
		this.age = Years.yearsBetween(dateOfBirth, DateTime.now()).getYears();
	}
	
	/** 
	 * Get Date of Birth
	 * @return DateTime
	 */
	public DateTime getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	/** 
	 * Set Date of Birth
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		setAge();
	}
	
	/** 
	 * Get Student ID
	 * @return int
	 */
	public int getId() {
		return this.id;
	}
	
	/** 
	 * Set Student ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/** 
	 * Get Student Username
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set Student Username (override)
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/** 
	 * Get List of Courses
	 * @return ArrayList<Course>
	 */
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
	
	/** 
	 * Set List of Courses
	 * @param courses
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	/** 
	 * Get List of Modules
	 * @return ArrayList<Module>
	 */
	public ArrayList<Module> getModules() {
		return this.modules;
	}
	
	/** 
	 * Set List of Modules
	 * @param modules
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	/** 
	 * Return String version of Student
	 * @return String
	 */
	@Override
	public String toString(){
		String output = "";
		output += 
		"               Name: 		 " + name +
		"\n               Age: 			 " + age +
		"\n				  Date of Birth: " + dateOfBirth +
		"\n				  Username:		 " + username +
		"\n				  ID:			 " + id;
		return output;
	}
			
}
