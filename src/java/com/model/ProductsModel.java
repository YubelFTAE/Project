/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.entity.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ngquangdat
 */
public class ProductsModel {
    public ArrayList<Products> getProducts() throws Exception {
        ArrayList<Products> list = new ArrayList<>();
        String sql = "SELECT* FROM Products";
        Connection connection = new DBContext().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            list.add(new Products(rs.getInt("product_id"), rs.getString("product_name"), 
                    rs.getString("product_detail"), rs.getString("product_img"),
                    rs.getString("product_provider"), rs.getFloat("product_price"), rs.getString("product_status"), rs.getString("category_id")));
        }
        connection.close();
        return list;
    }

    public boolean insertProducts(Products p) {
        String sql = "INSERT INTO [dbo].[Products]([product_name],[product_detail],[product_img],[product_provider],[product_price],[product_status],[category_id]) VALUES(?,?,?,?,?,?,?)";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getProduct_name());
            statement.setString(2, p.getProduct_detail());
            statement.setString(3, p.getProduct_img());
            statement.setString(4, p.getProduct_provider());
            statement.setFloat(5, p.getProduct_price());
            statement.setString(6, p.getProduct_status());
            statement.setString(7, p.getCategory_id());
            statement.executeUpdate();
            con.close();
        } catch (Exception e) {

        }
        return true;
    }
    
    public boolean updateProducts(Products p) {
        String sql = "UPDATE [dbo].[Products] SET [product_name] =  ?,[product_detail] =  ?,[product_img] =  ?,[product_provider] =   ?,[product_price] =   ?,[product_status] =  ?,[category_id] = ? WHERE product_id = ?";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getProduct_name());
            statement.setString(2, p.getProduct_detail());
            statement.setString(3, p.getProduct_img());
            statement.setString(4, p.getProduct_provider());
            statement.setFloat(5, p.getProduct_price());
            statement.setString(6, p.getProduct_status());
            statement.setString(7, p.getCategory_id());
            statement.setInt(8, p.getProduct_id());
            statement.executeUpdate();
            con.close();
        } catch (Exception e) {

        }
        return true;
    }
}
