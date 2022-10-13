package com.ct414a1a.ug;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * @author Donnacha O'Dwyer		2022
 *
 *Course Class to encapsulate standard fields
 *Course Name, List of Modules, List of Students, Start Date, End Date
 *
 */
public class Course {
	public String courseName;		//Name of Course
	public List<Module> modules = new ArrayList<Module>();		//List of Modules in course
	public List<Student> students = new ArrayList<Student>();	//List of Students taking this course
	public DateTime startDate = new DateTime();					//Start Date of course
	public DateTime endDate = new DateTime();					//End Date of course
	
	//Constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	//Add Module to list of Modules
	public void addModule(Module module) {
		this.modules.add(module);
	}
	//Overloaded Method add list of modules to list of modules
	public void addModule(ArrayList<Module> modules) {
		this.modules.addAll(modules);
	}
	
	//Add Student to list of students
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	//Overloaded Method add list of Students to list of Students
	public void addStudent(ArrayList<Student> students) {
		this.students.addAll(students);
	}
	
	//Add Start Date
	public void addStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	//Add End Date
	public void addEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}
