package com.vti;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {

        String email = "asd_-fz0.as@gmail.com.vn";
        String pwd = "asdgCfad";

        Pattern compileEmail = Pattern.compile("^[\\w\\-_.]+@[\\w\\-_]+(\\.[\\w\\-_]+){1,2}$");
        Matcher matcherEmail = compileEmail.matcher(email);
        if (!matcherEmail.find()) {
            System.out.println("Sai email");
            return;
        }

        Pattern compilePwd = Pattern.compile(".*[A-Z].*");
        Matcher matcherPwd = compilePwd.matcher(pwd);
        if (!matcherPwd.find() || pwd.length() < 6 || pwd.length() > 12) {
            System.out.println("Sai password");
            return;
        }
    }
}
