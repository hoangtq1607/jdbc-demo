package com.vti;

import com.vti.entity.User;
import com.vti.repository.UserRepository;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        bai2();
        bai3(1);
    }

    static void bai2() {
        List<User> all = UserRepository.findAll();
        System.out.printf("%-10s | %-20s | %-15s\n", "ID", "FULL_NAME", "EMAIL");
        System.out.println("____________________________________________________________");
        for (User user : all) {
            System.out.printf("%-10s | %-20s | %-15s\n", user.getUserId(), user.getFullName(), user.getEmail());
        }
    } 
    static void bai3(int userId) {
        User user = UserRepository.findById(userId);
        System.out.println(user);
    }


}
