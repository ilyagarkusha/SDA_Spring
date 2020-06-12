package com.sda.spring.boot.mvc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDbConnection {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
        String user = "springstudent";
        String pass = "springstudent";
        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
