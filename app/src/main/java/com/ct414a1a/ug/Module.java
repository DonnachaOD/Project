package com.ct414a1a.ug;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Donnacha O'Dwyer		2022
 *
 * Module class to encapsulate standard fields
 * Module Name, Module ID, Lecturer, List of Students, List of Courses
 * 
 */
public class Module {
	
	public String moduleName;	//Name of Module
	public String id;			//Module ID
	public Lecturer lecturer;	//Lecturer who teaches module
	public List<Student> students = new ArrayList<Student>();	//List of students who take this module
	public List<Course> courses = new ArrayList<Course>();		//List of courses that include this module
	
	//Constructor
	public Module(String moduleName, String id, Lecturer lecturer) {
		this.moduleName = moduleName;
		this.id = id;
		this.lecturer = lecturer;
	}
	
	//Add student to list of students
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//Overloaded Method add list of students to list of students
	public void addStudent(ArrayList<Student> students) {
		students.addAll(students);
	}
	
	//Add Course to list of Courses
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	//Overloaded Method add Course to list of Courses
	public void addCourse(ArrayList<Course> courses) {
		courses.addAll(courses);
	}
}
