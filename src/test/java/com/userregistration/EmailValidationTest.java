package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private String testMail;
    private boolean expectedResult;

    public EmailValidationTest(String email,boolean expectedResult) {
        this.testMail=email;
        this.expectedResult=expectedResult;

    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {   {"abc@yahoo.com",true},
                                                {"abc-100@yahoo.com",true},
                                                {"abc.100@yahoo.com",true},
                                                {"abc111@abc.com",true},
                                                {"abc-100@abc.net",true},
                                                {"abc.100@abc.com.au",true},
                                                {"abc@1.com",true},
                                                {"abc@gmail.com.com",true},
                                                {"abc+100@gmail.com",true},
                                                {"abc@.com.com",false},
                                                {"abc.com",false},
                                                {"abc..2002@gmail.com",false},
                                                {"abc.@gmail.com",false},
                                                {"abc@gmail.com.1a",false},
                                                {"abc@ab@gmail.com",false},
                                                {"abc@gmail.com.aa.au",false},
                                                {"abc@%*.com",false},
                                                {"abc()*@gmail.com",false} } );
        }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerParameterizedResult() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailSamples(this.testMail);
        Assert.assertEquals(this.expectedResult,result);
    }
}


