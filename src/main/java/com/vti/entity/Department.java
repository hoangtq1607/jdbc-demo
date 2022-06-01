package com.vti.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
    private int id;
    private String name;

    public Department(String name) {
        this.name = name;
    }

    //remote repository
    //local repository

}
