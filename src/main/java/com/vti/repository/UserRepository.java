package com.vti.repository;

import com.vti.config.ConnectionProvider;
import com.vti.entity.Role;
import com.vti.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> findAll() {
        String sql = "select user_id, full_name, email, password, role, exp_in_year, pro_skill\n" +
                "from account_user";
        ArrayList<User> users = new ArrayList<>();
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String fullName = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String role = resultSet.getString("role");
                int exInYear = resultSet.getInt("exp_in_year");
                String proSkill = resultSet.getString("pro_skill");
                User user = new User(userId, fullName, email, password, Role.valueOf(role), exInYear, proSkill);
                users.add(user);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return users;
    }

    public static User findById(int userId) {
        String sql = "select user_id, full_name, email, password, role, exp_in_year, pro_skill\n" +
                "from account_user where user_id = ?";
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String fullName = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String role = resultSet.getString("role");
                int exInYear = resultSet.getInt("exp_in_year");
                String proSkill = resultSet.getString("pro_skill");
                return new User(userId, fullName, email, password, Role.valueOf(role), exInYear, proSkill);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static boolean deleteById(int userId) {
        String sql = "delete from account_user where user_id = ?";
        try {

            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            int deletedRows = statement.executeUpdate();
            if (deletedRows > 0) {
                return true;
            }
        } catch (SQLException exception) {
            exception.printStackTrace();

        }
        return false;
    }

    public static boolean createUser(User user) {

        String sql = "insert into account_user(user_id, full_name, email, password, role, exp_in_year, pro_skill) " +
                " value (?, ?, ?, ?, ?, ?, ?)";

        return false;
    }
}
