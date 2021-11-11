package Reiziger;

import java.sql.*;

public class connect_reiziger {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ovchip", "postgres", "bluun123")) {
            System.out.println("Verbonden met database!");
            Statement statement = connection.createStatement();

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

}