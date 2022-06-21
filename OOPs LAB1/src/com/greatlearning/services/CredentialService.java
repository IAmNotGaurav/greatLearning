package com.greatlearning.services;

import java.util.Random; 

import com.greatlearning.model.*;

public class CredentialService { // Class for email and password creation

	public char[] generatePassword() { // class for random password generation
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChars = "!@#$%^&*(_+?/.=<>";
		
		String pass = capitalLetters + smallLetters + numbers + specialChars;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		for(int i = 0; i < 8; i++) { 
			
			
			password[i] = pass.charAt(random.nextInt(pass.length()));
		}
		return password;
			
		
	}
	                // class for generating Email Address
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName + lastName + "@" + department + ".xyz.com"; 
		
	}               // class for showing the credential generated
	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		
		System.out.println("Dear "+ employee.getFirstName()+ ", " + "your generated Credentials are as follows:");
		System.out.println("Email -----> "+ email);
		System.out.print("Password -----> 1"+ "");
		System.out.print(generatePassword);
		
	}
}
