package com.vti;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.utils.CheckUtils;

import java.util.List;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bai56();
    }

    private static void bai56() {
        System.out.print("Nhap email: ");
        String email = scanner.nextLine();
        if (!CheckUtils.isEmailValid(email)) {
            System.out.println("Email khong dung dinh dang");
            return;
        }
        System.out.print("Nhap password: ");
        String password = scanner.nextLine();
        if (!CheckUtils.isPasswordValid(password)) {
            System.out.println("Password khong dung dinh dang");
            return;
        }
        User adminUser = UserRepository.findByEmailAndPassword(email, password);
        if (adminUser != null) {
            System.out.println("Welcome '" + adminUser.getFullName() + "' to this system!");
            taoUser();
        } else {
            System.out.println("Email or password incorrect!!");
        }

    }

    static void bai2() {
        System.out.println("----------------BAI 2----------------");
        List<User> all = UserRepository.findAll();
        System.out.printf("%-10s | %-20s | %-15s\n", "ID", "FULL_NAME", "EMAIL");
        System.out.println("____________________________________________________________");
        for (User user : all) {
            System.out.printf("%-10s | %-20s | %-15s\n", user.getUserId(), user.getFullName(), user.getEmail());
        }
    }

    static void bai3(int userId) {
        System.out.println("----------------BAI 3----------------");
        User user = UserRepository.findById(userId);
        System.out.println(user);
    }

    static void bai4(int userId) {
        System.out.println("----------------BAI4----------------");
        boolean deleted = UserRepository.deleteById(userId);
        if (deleted) {
            System.out.println("----------------Xoa thanh cong----------------");
        } else {
            System.out.println("----------------Xoa that bai----------------");
        }
    }

    static void taoUser() {
        System.out.print("Nhap full name: ");
        String fullName = scanner.nextLine();
        if (!CheckUtils.isFullNameValid(fullName)) {
            System.out.println("Full name chi duoc chua khoang trang va ki tu dac biet!");
            return;
        }

        System.out.print("Nhap email: ");
        String email = scanner.nextLine();

        if (!CheckUtils.isEmailValid(email)) {
            System.out.println("Email khong dung dinh dang");
            return;
        }

        User user = new User();
        user.setEmail(email);
        user.setFullName(fullName);
        user.setPassword("123456");
        user.setRole(Role.EMPLOYEE);
        user.setProSkill("java, mysql");
        user.setExpInYear(100);
        boolean success = UserRepository.createUser(user);
        if (success) {
            System.out.println("tao thanh cong");
        }
    }


}
