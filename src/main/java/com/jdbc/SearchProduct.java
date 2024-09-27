package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SearchProduct {

    private final String query = "select * from product where price < ?";
    ArrayList<String> arr = new ArrayList<>();
    public String[] searchProducts(int price) throws SQLException,Exception {

        try {
            JdbcConnect jdbc = new JdbcConnect();
            Connection con = jdbc.connectToDb();
            PreparedStatement statement = con.prepareStatement(query);
        
            statement.setInt(1,price);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
             
                arr.add(rs.getString("product_name"));
            }
            rs.close();
            statement.close();
            con.close();
            return  arr.toArray(new String[0]);

        } catch (SQLException e) {
            System.out.println(e.getMessage() + e.getSQLState() + e.getErrorCode());
            throw new SQLException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

}
