package edu.badpals;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/mundo";
            Connection conexion = DriverManager.getConnection( url,"root", "root");

            // Create a statement
            Statement s = conexion.createStatement();

            // Execute the query
            ResultSet rs = s.executeQuery("SELECT * FROM paises"); // Corrected table name

            // Process the result set
            while (rs.next()) {
                System.out.println("nombre_pais: " + rs.getString("nombre_pais") + ", habitantes: " +
                        rs.getString("habitantes") + " " + rs.getString("capital"));
            }

            // Close the resources
            rs.close();
            s.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}