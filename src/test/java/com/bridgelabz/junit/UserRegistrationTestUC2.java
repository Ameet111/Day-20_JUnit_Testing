package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;

import com.bridglabz.junit.UserRegistrationUC2;

public class UserRegistrationTestUC2 {
	
	UserRegistrationUC2 userRegistration = new UserRegistrationUC2();
	 
    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ameet");
        Assert.assertEquals(true, result);
    }

	@Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("ameet");
        Assert.assertEquals(false, result);
    }

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

}
