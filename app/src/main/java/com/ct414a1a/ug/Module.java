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
	
	/**
	 * Add student to list of students
	 * @param student
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * Overloaded Method add list of students to list of students
	 * @param students
	 */
	public void addStudent(ArrayList<Student> students) {
		students.addAll(students);
	}
		
	/** 
	 * Add Course to list of Courses
	 * @param course
	 */
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	/** 
	 * Overloaded Method add Course to list of Courses
	 * @param courses
	 */
	public void addCourse(ArrayList<Course> courses) {
		courses.addAll(courses);
	}

	/** 
	 * Get Module Name
	 * @return String
	 */
	public String getModuleName() {
		return this.moduleName;
	}
	
	/** 
	 * Set Module Name
	 * @param moduleName
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	/** 
	 * Get Module ID
	 * @return String
	 */
	public String getId() {
		return this.id;
	}
	
	/** 
	 * Set Module ID
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/** 
	 * Get Lecturer
	 * @return Lecturer
	 */
	public Lecturer getLecturer() {
		return this.lecturer;
	}
	
	/** 
	 * Set Lecturer
	 * @param lecturer
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	/** 
	 * Get list of Students
	 * @return List<Student>
	 */
	public List<Student> getStudents() {
		return this.students;
	}
	
	/** 
	 * Set List of Students
	 * @param students
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	/** 
	 * Get list of Courses
	 * @return List<Course>
	 */
	public List<Course> getCourses() {
		return this.courses;
	}
	
	/** 
	 * Set List of Courses
	 * @param courses
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	/** 
	 * Return String version of Module
	 * @return String
	 */
	@Override
	public String toString() {
		String output =  "{" +
			"\n		ModuleName 	= '" + getModuleName() + "'" +
			"\n		ID 			= '" + getId() + "'" +
			"\n 	Lecturer	= '" + getLecturer() + "'" +
			"\n     Students	= {";
			int i = 1;
			for(Student student : this.getStudents()){
				output += "\n        Student #" + i + " : " + student;
				i++;
			}
			output += "\n		}";
			return output;
	}
}
