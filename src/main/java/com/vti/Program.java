package com.vti;

import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.repository.UserRepository;

import java.util.List;

public class Program {

    public static void main(String[] args) {
//        bai2();
//        bai4(10);
        taoUser();
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
        User user = new User();
        user.setEmail("hoang1@vti.com.vn");
        user.setFullName("Hoang Tran");
        user.setPassword("123456");
        user.setRole(Role.ADMIN);
        user.setProSkill("java, mysql");
        user.setExpInYear(100);
        UserRepository.createUser(user);
    }


}
