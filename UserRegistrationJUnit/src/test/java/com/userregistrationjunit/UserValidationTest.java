package com.userregistrationjunit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserValidationTest {
	
	
	/**
	 * PROCEDURE
	 * 1. Test case for firstName
	 * 2. Test case for lastName
	 * 3. Test case for emailName
	 * 4. Test case for mobileNumber
	 * 5. Test case for password
	 */

	/**
	 * Test case for firstName
	 */
	@Test
	public void firstNameValidation() {
		assertEquals(true, UserRegistrationJUnit.firstName());
	}
	
	/**
	 * Test case for lastName
	 */
	@Test
	public void lastNameValidation() {
		assertEquals(true, UserRegistrationJUnit.lastName());
	}
	
	/**
	 * Test case for Email
	 */
	@Test
	public void emailValidation() {
		assertEquals(true, UserRegistrationJUnit.email());
	}
	
	/**
	 * Test case for Mobile Number
	 */
	@Test
	public void mobileNumberValidation() {
		assertEquals(true, UserRegistrationJUnit.mobileNumber());
	}
	
	/**
	 * Test case for Password
	 */
	@Test
	public void passwordValidation() {
		assertEquals(true, UserRegistrationJUnit.password());
	}
}
