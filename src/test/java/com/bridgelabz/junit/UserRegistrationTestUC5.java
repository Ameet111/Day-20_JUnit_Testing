package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;

import com.bridglabz.junit.UserRegistrationUC5;

public class UserRegistrationTestUC5 {
	
	UserRegistrationUC5 userRegistration =new UserRegistrationUC5();

	@Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ameeth");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("ameeth");
        Assert.assertEquals(false, result);
    }
    
    /*
     * method to check Last name
     */

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Jadhav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("jadhav");
        Assert.assertEquals(false, result);
    }
    
    /*
	 * methods to check mail addresss
	 */
    
        @Test
    	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.emailAddress("Ameeth@bl.co.in");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.emailAddress("abc()*@gmail.com");
    		Assert.assertEquals(false, result);
    }
    
    	/*
    	 * test cases for mobile number validation
    	 */
    	@Test
    	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.phoneNumber("123456789");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
    		boolean result = userRegistration.phoneNumber("+91 987654321");
    		Assert.assertEquals(false, result);
    	}

    	/*
    	 * method to validate password
    	 */
    	@Test
    	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.passwordRule1("maharashtra");
    		Assert.assertEquals(true, result);
    	}
    	@Test
    	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.passwordRule1("abcd");
    		Assert.assertEquals(false, result);
    	}

}
