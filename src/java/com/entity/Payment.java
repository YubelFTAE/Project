/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Lee_Van_Trinh
 */
public class Payment {

    private int payment_id;
    private String payment_name;
    private String payment_detail;
    private boolean allowed;

    public Payment() {
    }
    
    

    public Payment(int payment_id, String payment_name, String payment_detail, boolean allowed) {
        this.payment_id = payment_id;
        this.payment_name = payment_name;
        this.payment_detail = payment_detail;
        this.allowed = allowed;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_name() {
        return payment_name;
    }

    public void setPayment_name(String payment_name) {
        this.payment_name = payment_name;
    }

    public String getPayment_detail() {
        return payment_detail;
    }

    public void setPayment_detail(String payment_detail) {
        this.payment_detail = payment_detail;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    
}
