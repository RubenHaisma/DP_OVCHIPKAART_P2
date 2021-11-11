package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ovchip", "postgres", "******")) {
            System.out.println("Verbonden met database!");
            Statement statement = connection.createStatement();
            System.out.println("Data laden...");
            System.out.println("Alle reizigers:");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.reiziger");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("voorletters") + " " + resultSet.getString("achternaam"));
            }

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

}