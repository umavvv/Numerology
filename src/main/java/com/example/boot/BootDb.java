package com.example.boot;
import java.sql.*;

public class BootDb {
   private String URL = "jdbc:postgresql://localhost:5432/numerology_db";
   private String USERNAME = "postgres";
   private String PASSWORD = "9078563412";

    public void connect(){
        try {
        Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

        try {
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = null;

        Statement stmt = connection.createStatement();
        String query = "SELECT UCASE(personality) FROM  sector ;";

        ResultSet rs = stmt.executeQuery("SELECT id FROM sector" );
        while(rs.next()) {
            System.out.println(rs.getString("id"));
        }
    }
        catch(Exception ex) {
            System.out.println(ex);

        }
}}