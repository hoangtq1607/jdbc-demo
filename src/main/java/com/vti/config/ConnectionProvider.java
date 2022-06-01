package com.vti.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private static String url = "jdbc:mysql://localhost:3306/jdbc_test";
    private static String username = "root";
    private static String pwd = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, pwd);
    }

}
