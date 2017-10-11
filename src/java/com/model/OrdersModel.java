/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.entity.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GnaS_Tahn
 */
public class OrdersModel {

    public List<Orders> getOrders() throws Exception {
        List<Orders> r = new ArrayList<Orders>();
        String query = "select * from [Orders] ";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int oder_id = rs.getInt("oder_id");
            Date order_date = rs.getDate("order_date");
            String order_status = rs.getString("order_status");
            String receiver_name = rs.getString("receiver_name");
            String receiver_phone = rs.getString("receiver_phone");
            String receiver_email = rs.getString("receiver_email");
            String receiver_address = rs.getString("receiver_address");
            String note = rs.getString("note");
            int customer_id = rs.getInt("customer_id");;
            int payment_id = rs.getInt("payment_id");;

            r.add(new Orders(oder_id, order_date, order_status, receiver_name, receiver_phone, receiver_email, receiver_address, note, customer_id, payment_id));
        }
        rs.close();
        conn.close();
        return r;
    }

    public void insertOrders(Orders or) throws Exception {
        String query = "INSERT INTO [Orders]\n"
                + "           ([order_date]\n"
                + "           ,[order_status]\n"
                + "           ,[receiver_name]\n"
                + "           ,[receiver_phone]\n"
                + "           ,[receiver_email]\n"
                + "           ,[receiver_address]\n"
                + "           ,[note]\n"
                + "           ,[customer_id]\n"
                + "           ,[payment_id])\n"
                + "     VALUES(?,?,?,?,?,?,?,?,?)";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setDate(1, (java.sql.Date) or.getOrder_date());
        ps.setString(2, or.getOrder_status());
        ps.setString(3, or.getReceiver_name());
        ps.setString(4, or.getReceiver_phone());
        ps.setString(5, or.getReceiver_email());
        ps.setString(6, or.getReceiver_address());
        ps.setString(7, or.getNote());
        ps.setInt(8, or.getCustomer_id());
        ps.setInt(9, or.getPayment_id());
        ps.executeUpdate();
        conn.close();

    }

    public boolean updateProducts(Orders or) {
        String sql = "UPDATE [Orders]  SET [order_date] = ?\n"
                + "      ,[order_status] = ?\n"
                + "      ,[receiver_name] = ?\n"
                + "      ,[receiver_phone] = ?\n"
                + "      ,[receiver_email] = ?\n"
                + "      ,[receiver_address] = ?\n"
                + "      ,[note] = ?\n"
                + "      ,[customer_id] = ?\n"
                + "      ,[payment_id] = ? WHERE oder_id = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (java.sql.Date) or.getOrder_date());
            ps.setString(2, or.getOrder_status());
            ps.setString(3, or.getReceiver_name());
            ps.setString(4, or.getReceiver_phone());
            ps.setString(5, or.getReceiver_email());
            ps.setString(6, or.getReceiver_address());
            ps.setString(7, or.getNote());
            ps.setInt(8, or.getCustomer_id());
            ps.setInt(9, or.getPayment_id());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {

        }
        return true;
    }
}
