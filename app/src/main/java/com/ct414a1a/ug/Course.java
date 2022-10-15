package com.ct414a1a.ug;

import java.util.ArrayList;

import org.joda.time.DateTime;

/**
 * @author Donnacha O'Dwyer		2022
 *
 * Course Class to encapsulate standard fields
 * Course Name, List of Modules, List of Students, Start Date, End Date
 *
 */
public class Course {

	public String courseName;		//Name of Course
	public ArrayList<Module> modules = new ArrayList<Module>();		//List of Modules in course
	public ArrayList<Student> students = new ArrayList<Student>();	//List of Students taking this course
	public DateTime startDate = new DateTime();					//Start Date of course
	public DateTime endDate = new DateTime();					//End Date of course
	
	//Constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	/** 
	 * Add Module to list of Modules
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
	 * Add Student to list of students
	 * @param student
	 */
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	/** 
	 * Overloaded Method add list of Students to list of Students
	 * @param students
	 */
	public void addStudent(ArrayList<Student> students) {
		this.students.addAll(students);
	}
	
	/** 
	 * @return String
	 */
	public String getCourseName(){
		return this.courseName;
	}

	/** 
	 * Set Course Name
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	/** 
	 * @return ArrayList<Module>
	 */
	public ArrayList<Module> getModules(){
		return modules;
	}

	/** 
	 * Set List of Modules
	 * @param modules
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	/** 
	 * Get List of Students
	 * @return ArrayList<Student>
	 */
	public ArrayList<Student> getStudents() {
		return this.students;
	}
	
	/** 
	 * Set List of Students
	 * @param students
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	/** 
	 * Get Start Date
	 * @return DateTime
	 */
	public DateTime getStartDate() {
		return this.startDate;
	}

	/** 
	 * Set Start Date
	 * @param startDate
	 */
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	/** 
	 * Get End Date
	 * @return DateTime
	 */
	public DateTime getEndDate() {
		return this.endDate;
	}
	
	/** 
	 * Set End Date
	 * @param endDate
	 */
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	/** 
	 * Return String version of course
	 * @return String
	 */
	@Override
	public String toString() {
		String output = "";
		output +="{" +
		" Course Name ='" + getCourseName() + "'" +
		"\nModules = {";
		for(Module module : this.getModules()){
			output +="\n	" + module;
		}
		output += "}" +
		", students='" + getStudents() + "'" +
		", startDate='" + getStartDate() + "'" +
		", endDate='" + getEndDate() + "'" +
		"}";
		return output;
	}
}
