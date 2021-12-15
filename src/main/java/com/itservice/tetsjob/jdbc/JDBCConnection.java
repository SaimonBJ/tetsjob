package com.itservice.tetsjob.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    private static Connection connection = null;


    public static Connection connectDB(){
        try {
            //Registering the HSQLDB JDBC driver
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            System.out.println("Driver is connected");
            //Creating the connection with HSQLDB
            connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
            System.out.println("Connection established");

            if (connection!= null){
                System.out.println("Connection created successfully");

            }else{
                System.out.println("Problem with creating connection");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }




}
