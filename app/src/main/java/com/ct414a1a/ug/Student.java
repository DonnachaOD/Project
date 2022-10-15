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
		for(Course course : courses){
			this.addModule(course.getModules());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

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
