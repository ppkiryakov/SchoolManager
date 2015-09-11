package edu.pragmatic.schoolmodel;

public class Student {
	
	public String name;
	public String lastName;
	public int number;
	
	public Student(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public String getFullName(){
		return name + " " + lastName;
	}
	
}
