package com.userregistration;

import java.util.regex.Pattern;

public class UserValidator {
    private static  final String FIRST_NAME_REGEX="^([A-Z]{1}[a-z]{2,})$";
    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(fname).matches();
    }
}
