package com.toitoi.bd.toitoibd;
import java.sql.*;
public class DbConnect {



    public static Connection getConnect(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            return con;
        } catch (SQLException e) {
            return null;

        }

    }
}
