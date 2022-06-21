package com.greatlearning.services;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass { // main class

	public static void main(String[] args) {
		Employee employee = new Employee ("Gaurav","Parashar"); // creating object of employee class
		CredentialService cs = new CredentialService();         // creating object of credentialService class
		String generateEmail;
		char [] generatePassword;
		
		// Showing User the Department Option to choose from
		
		System.out.println("Please enter your department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) { // Switch Case for implementation of Department selection
		
		case 1: {        // For Technical Option
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "technical");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		}
		break;
		
		case 2: {       // For Admin Option
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		}
		break;
		
		case 3: {       // For HR Option
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		}
		break;
		
		case 4: {       // For Legal Option
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		}
		break;
		
		default : {     // For selection apart from the 4 values given
			System.err.println("Please choose valid option");		
		}
		break;
		}
	}
}
