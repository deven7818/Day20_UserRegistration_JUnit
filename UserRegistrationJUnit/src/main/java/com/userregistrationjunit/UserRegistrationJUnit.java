package com.userregistrationjunit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationJUnit{
	
	/**
	 * PROCEDURE
	 * 1. Method for FirstName validation
	 * 2. Method for LastName validation
	 * 3. Method for Email validation
	 * 4. Method for Mobile Number validation
	 * 5. Method for Password Validation
	 */
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Method for first Name validation 
	 * @return - validated firstName
	 */
	public static boolean firstName() {			
		UserRegistrationJUnit user = new UserRegistrationJUnit();
		System.out.println("Enter First Name : ");
		String regex = "[A-Z][a-z]{2,}";
		String firstName = user.sc.next();
		return Pattern.matches(regex, firstName);
	}
	
	/**
	 * Method for last Name validation 
	 * @return - validated lastName
	 */
	public static boolean lastName() {			
		UserRegistrationJUnit user = new UserRegistrationJUnit();
		System.out.println("Enter Last Name : ");
		String regex = "[A-Z][a-z]{2,}";
		String lastName = user.sc.next();
		return Pattern.matches(regex, lastName);
	}
	
	/**
	 * Method for email validation 
	 * @return - validated email
	 */
	public static boolean email() {
		UserRegistrationJUnit user = new UserRegistrationJUnit();
		System.out.println("Enter the Email : ");
		String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
		String email = user.sc.next();
		return Pattern.matches(regex, email);
	}
	
	/**
	 * Method for Mobile Number validation 
	 * @return - validated email
	 */	
	public static boolean mobileNumber() {
		UserRegistrationJUnit user = new UserRegistrationJUnit();
		System.out.println("Enter Mobile Number : " );
		String regex = "^([0-9]{2}[\\\\s]?){1}[0-9]{9,10}$";
		String mobileNumber = user.sc.next();
		return Pattern.matches(regex, mobileNumber);
	}

	/**
	 * Method for Password validation 
	 * @return - validated password
	 */	
	public static boolean password() {
		UserRegistrationJUnit user = new UserRegistrationJUnit();
		System.out.println("Enter Password : " );
		String regex = "^(?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\\\@\\\\#\\\\^][a-zA-Z0-9]*$";
		String password = user.sc.next();
		return Pattern.matches(regex, password);
	}

}