/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.entity.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Lee_Van_Trinh
 */


public class CustomersModel {

    public ArrayList<Customers> getCustomers() throws Exception {
        ArrayList<Customers> list = new ArrayList<>();
        String sql = "SELECT* FROM Customers";
        Connection connection = new DBContext().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            list.add(new Customers(rs.getInt("customer_id"),
                    rs.getString("customer_name"),
                    rs.getString("customer_address"),
                    rs.getString("customer_phone"),
                    rs.getString("customer_email"),
                    rs.getString("username")));

        }
        connection.close();
        return list;
    }

    public boolean insertCustomers(Customers p) {
        String sql = "INSERT INTO [dbo].[Customers]([customer_id],[customer_name],[customer_address],[customer_phone],[customer_email],[username]) VALUES(?,?,?,?,?,?)";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getCustomer_name());
            statement.setString(2, p.getCustomer_address());
            statement.setString(3, p.getCustomer_phone());
            statement.setString(4, p.getCustomer_email());
            statement.setString(5, p.getUsername());

            statement.executeUpdate();
            con.close();
        } catch (Exception e) {

        }
        return true;
    }

    public boolean updateCustomers(Customers p) {
        String sql = "UPDATE [dbo].[Customers] SET [customer_name] =  ?,[customer_address] =  ?,[customer_phone] =  ?,[customer_email] =   ?,[username] =   ? WHERE product_id = ?";
        try {
            Connection con = new DBContext().getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getCustomer_name());
            statement.setString(2, p.getCustomer_address());
            statement.setString(3, p.getCustomer_phone());
            statement.setString(4, p.getCustomer_email());
            statement.setString(5, p.getUsername());
            statement.executeUpdate();
            con.close();
        } catch (Exception e) {

        }
        return true;
    }

}
