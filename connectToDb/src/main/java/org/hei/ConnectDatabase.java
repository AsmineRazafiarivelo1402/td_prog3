package org.hei;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {
    public static void main(String[] args)
    {
        String jdbcURL
                = "jdbc:postgresql://localhost:5432/biblio";
        String username = "postgres";
        String password = "Asm1n31402";

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection connection
                    = DriverManager.getConnection(
                    jdbcURL, username, password);
            System.out.println(
                    "Connected to PostgreSQL database!");




            // Close the connection
            connection.close();
            System.out.println("Connection closed.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
