package com.ct414a1a.ug;

import java.util.ArrayList;
import java.util.List;

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
	public List<Course> courses = new ArrayList<Course>();	//Courses taken
	public List<Module> modules = new ArrayList<Module>();	//Modules taken
	
	//Constructor
	public Student(String name, DateTime dateOfBirth, int id) {
		this.name = name;
		this.age = Years.yearsBetween(dateOfBirth, DateTime.now()).getYears();
		System.out.println(age);
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		//generate username
		this.username = getUsername(this.name, this.age);
	}

	//Generate username from name and age
	private String getUsername(String name, int age) {
		return this.username = name.replaceAll("\\s", "") + Integer.toString(age);
	}
	
	//Get username
	public String getUsername() {
		return username;
	}
	
	//Add module to list of modules
	public void addModule(Module module) {
		this.modules.add(module);
	}
	
	//Overloaded Method add list of modules to list of modules
	public void addModule(ArrayList<Module> modules) {
		this.modules.addAll(modules);
	}
	
	//Add Course to list of courses
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	//Overloaded Method add list of courses to list of courses
	public void addCourse(ArrayList<Course> courses) {
		this.courses.addAll(courses);
	}
}
