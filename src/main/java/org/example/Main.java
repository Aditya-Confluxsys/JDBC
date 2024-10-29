package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/FinanceApp6";
        String username = "postgres";
        String password = "Noah";

        try{
            //Connecting to database
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection created");

            //Creating a table
//            String query = "create table JDBC(id int not null, name varchar(100))";
//            PreparedStatement statement = con.prepareStatement(query);
//            statement.executeUpdate();

            //Inserting into table
//            String query = "insert into JDBC(id,name) values (?,?)";
//            PreparedStatement statement = con.prepareStatement(query);
//            Object[][] data = {
//                    {1,"Aditya"},
//                    {2,"Prem"},
//                    {3,"Saurabh"}
//            };
//            for(Object[] record : data){
//                statement.setInt(1,(Integer) record[0]);
//                statement.setString(2,(String) record[1]);
//                statement.executeUpdate();
//            }
//            int id = 1 ;
//            String name = "Aditya";
//            statement.setInt(1,id);
//            statement.setString(2,name);

            //Updating the record
//            String query = "update JDBC set name=? where id = ?";
//            PreparedStatement statement = con.prepareStatement(query);
//            statement.setString(1,"Aditya Deshmukh");
//            statement.setInt(2,1);
//            statement.executeUpdate();
//
            //Deleteting the record
            String query = "delete from JDBC where id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,1);
            statement.executeUpdate();
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}