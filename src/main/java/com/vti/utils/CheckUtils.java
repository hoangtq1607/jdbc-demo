package com.vti.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUtils {

    public static boolean isEmailValid(String email) {
        Pattern compileEmail = Pattern.compile("^[\\w\\-_.]+@[\\w\\-_]+(\\.[\\w\\-_]+){1,2}$");
        Matcher matcherEmail = compileEmail.matcher(email);
        return matcherEmail.find();
    }

    public static boolean isPasswordValid(String password) {
        Pattern compilePwd = Pattern.compile(".*[A-Z].*");
        Matcher matcherPwd = compilePwd.matcher(password);
        return password.length() >= 6 && password.length() <= 12 && matcherPwd.find();
    }

    public static boolean isFullNameValid(String password) {
        Pattern compilePwd = Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher matcherPwd = compilePwd.matcher(password);
        return matcherPwd.find();
    }

}
