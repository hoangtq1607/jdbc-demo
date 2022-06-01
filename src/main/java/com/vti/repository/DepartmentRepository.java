package com.vti.repository;

import com.vti.config.ConnectionProvider;
import com.vti.entity.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

    //C
    public static void createDepartment(Department department) {

        String sql = "insert into department(name) value ( ? )";

        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, department.getName());
            statement.executeUpdate();
            System.out.println("Tạo department thành công: " + department.getName());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    //R
    public static List<Department> findAll() {

        String sql = "select * from department";

        List<Department> departments = new ArrayList<>();

        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Department department = new Department();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                department.setName(name);
                department.setId(id);
                departments.add(department);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return departments;
    }

    public static Department findById(int departmentId) {
        String sql = "select * from department where id = ?";

        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, departmentId);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Department department = new Department();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                department.setName(name);
                department.setId(id);
                return department;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    //U
    public static void updateDepartment(Department department) {

        String sql = "update department set name = ? where id = ?";

        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, department.getName());
            statement.setInt(2, department.getId());
            statement.executeUpdate();
            System.out.println("Update department thành công: " + department.getName());
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    //D
    public static void deleteDepartment(int departmentId) {

    }
}
