package com.greatlearning.model;

public class Employee {           // Defining Employee Class
	                              // Defining Variables of Employee Class
	String firstName;             
	String lastName;
	
	public String getFirstName() { // firstName getter function
		return firstName;
	}
	
	public void setFirstName(String firstName) { // firstName setter function
		this.firstName = firstName;
	}
	
	public String getLastName() { // lastName getter function
		return lastName;
	}
	
	public void setLastName(String lastName) { // lastName setter function
		this.lastName = lastName;
	}
	
	public Employee(String firstName, String lastName) {  // Creating a constructor of Employee Class
	 
		this.firstName = firstName;
		this.lastName = lastName;
		
		
	}	
}
