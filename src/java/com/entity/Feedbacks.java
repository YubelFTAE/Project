/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author GnaS_Tahn
 */
public class Feedbacks {

    private int feedback_id;
    private String feedback_detail;
    private int customer_id;
    private int oder_id;

    public Feedbacks() {
    }

    public Feedbacks(int feedback_id, String feedback_detail, int customer_id, int oder_id) {
        this.feedback_id = feedback_id;
        this.feedback_detail = feedback_detail;
        this.customer_id = customer_id;
        this.oder_id = oder_id;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getFeedback_detail() {
        return feedback_detail;
    }

    public void setFeedback_detail(String feedback_detail) {
        this.feedback_detail = feedback_detail;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getOder_id() {
        return oder_id;
    }

    public void setOder_id(int oder_id) {
        this.oder_id = oder_id;
    }

}
