package com.example.boot;
import java.sql.*;

//В данном классе проходит обработка SQL запроса а так же подключение к БД

public class ConnectDatabase {
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
        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM sector" );
        while(rs.next()) {
            System.out.println(rs.getString("personality"));
        }
    }
        catch(Exception ex) {
            System.out.println(ex);

        }
}}