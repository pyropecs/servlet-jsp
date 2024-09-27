package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnect {

    public Connection connectToDb() throws SQLException, Exception {
        try {
            String url = "jdbc:mariadb://localhost:3306/products";
            String user = "root";
            String password = "0000";
            Class.forName("org.mariadb.jdbc.Driver");
            DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + e.getSQLState() + e.getErrorCode());
            throw new SQLException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

}
