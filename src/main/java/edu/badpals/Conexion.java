package edu.badpals;

import java.sql.*;

public class Conexion {

    public Statement conectarseBBDD() {

        try {
            String url = "jdbc:mysql://localhost:3306/mundo";
            Connection conexion = DriverManager.getConnection(url, "root", "root");

            Statement s = conexion.createStatement();

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("Fallo en la conexión a la base de datos.");
            }

            return s;

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos:");
            e.printStackTrace();
            return null;
        }
    }

    public void leerDatos() {
        try {
            Statement s = conectarseBBDD();
            ResultSet rs = s.executeQuery("SELECT * FROM paises");

            while (rs.next()) {
                System.out.println("Nombre país: " + rs.getString("nombre_pais") + ", habitantes: " +
                        rs.getString("habitantes") + ", capital: " + rs.getString("capital") +
                        ", moneda: " + rs.getString("moneda"));
            }

            rs.close();
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addDatos(String nombre_pais, String habitantes, String capital, String moneda) {
        try {
            Statement s = conectarseBBDD();
            s.executeUpdate("INSERT INTO paises (nombre_pais, habitantes, capital, moneda) " +
                    "VALUES ('" + nombre_pais + "', '" + habitantes + "', '" + capital + "', '" + moneda + "')");
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modifyDatos(String nombre_pais, String habitantes, String capital, String moneda) {
        try {
            Statement s = conectarseBBDD();
            s.executeUpdate("UPDATE paises SET habitantes = '" + habitantes + "', capital = '" + capital +
                    "', moneda = '" + moneda + "' WHERE nombre_pais = '" + nombre_pais + "'");
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDatos(String nombre_pais) {
        try {
            Statement s = conectarseBBDD();
            s.executeUpdate("DELETE FROM paises WHERE nombre_pais = '" + nombre_pais + "'");
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
