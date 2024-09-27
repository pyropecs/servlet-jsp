package com.jdbc;

import java.sql.SQLException;

public class FetchProducts {

    private String[] products;

    public String[] fetchProduct(int price) {

        SearchProduct search = new SearchProduct();

        try {
            products = search.searchProducts(price);
            System.out.println(products.length);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return products;

    }

 

}
