package com.vti;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;
import com.vti.repository.HangHoaRepository;

import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) {
        
        String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

        String email = "admin@gmail.com";
        String pwd = "123456A78a";

        if (Pattern.matches(regex, email)) {
            System.out.println("dung dinh dang email");
        } else {
            System.out.println("email sai");

        }

        boolean existUpper = false;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (c >= 'A' && c<='Z') {
                existUpper = true;
            }
        }

        if (pwd.length() < 6 || pwd.length() > 12 || !existUpper) {
            System.out.println("pwd sai");

        } else {
            System.out.println("pwd dung");

        }

    }

}
