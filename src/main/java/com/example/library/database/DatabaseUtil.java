package com.example.library.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtil {

    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/library";
        String Username = "root";
        String Password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: Unable to load driver class!");
            ex.printStackTrace();
        }

        return DriverManager.getConnection(URL, Username, Password);
    }


}