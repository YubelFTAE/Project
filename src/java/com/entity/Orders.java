/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.Date;

/**
 *
 * @author GnaS_Tahn
 */
public class Orders {

    private int oder_id;
    private Date order_date;
    private String order_status;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_email;
    private String receiver_address;
    private String note;
    private int customer_id;
    private int payment_id;

    public Orders() {
    }

    public Orders(int oder_id, Date order_date, String order_status, String receiver_name, String receiver_phone, String receiver_email, String receiver_address, String note, int customer_id, int payment_id) {
        this.oder_id = oder_id;
        this.order_date = order_date;
        this.order_status = order_status;
        this.receiver_name = receiver_name;
        this.receiver_phone = receiver_phone;
        this.receiver_email = receiver_email;
        this.receiver_address = receiver_address;
        this.note = note;
        this.customer_id = customer_id;
        this.payment_id = payment_id;
    }

    public int getOder_id() {
        return oder_id;
    }

    public void setOder_id(int oder_id) {
        this.oder_id = oder_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_email() {
        return receiver_email;
    }

    public void setReceiver_email(String receiver_email) {
        this.receiver_email = receiver_email;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

}
