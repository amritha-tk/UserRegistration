package com.userregistration;

import java.util.regex.Pattern;

public class UserValidator {
    private static  final String FIRST_NAME_REGEX="^([A-Z]{1}[a-z]{2,})$";
    private static final String LAST_NAME_REGEX="^([A-Z]{1}[a-z]{2,})$";
    private static final String EMAIL_REGEX="^([a-z]{3,4}([\\.\\_\\-\\+]{1})?([A-Za-z]{3,4})?[@][a-zA-Z]{2,}[.]{1}co([.]{1})?([a-z]{2,3})?)$";
    private static final String MOBILE_REGEX="^[1-9]{2}[ ][0-9]{3,10}$";
    private static final String PASSWORD_REGEX="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$";
            //"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$";
            //"^([a-zA-Z0-9]{8,})$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern=Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern=Pattern.compile(EMAIL_REGEX);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String number) {
        Pattern pattern=Pattern.compile(MOBILE_REGEX);
        return pattern.matcher(number).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern=Pattern.compile(PASSWORD_REGEX);
        return pattern.matcher(password).matches();
    }


}
