package com.vti.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
    private int id;
    private String name;
    private String address;
    private String email;
}
