package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.validation.Validator;

public class UserValidatorTest {
    @Test
    public void givenFirstName_StartsWithCaps_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Amritha");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_LessThanThreeChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Am");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_StartsWithCaps_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Nair");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_LessThanThreeChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("TK");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("xyz@gg.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 9846974183");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("9846974183");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenPassword_WithMinEightChar_ReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Amritha11");
        Assert.assertEquals(true,result);
    }

}
