package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

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
}
