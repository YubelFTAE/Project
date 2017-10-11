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
public class Rating {

    private int rating_star;
    private String rating_detail;
    private int rating_id;
    private String guest_mail;
    private String guest_name;
    private int product_id;
    private int customer_id;

    public Rating() {
    }

    public Rating(int rating_star, String rating_detail, int rating_id, String guest_mail, String guest_name, int product_id, int customer_id) {
        this.rating_star = rating_star;
        this.rating_detail = rating_detail;
        this.rating_id = rating_id;
        this.guest_mail = guest_mail;
        this.guest_name = guest_name;
        this.product_id = product_id;
        this.customer_id = customer_id;
    }

    public int getRating_star() {
        return rating_star;
    }

    public void setRating_star(int rating_star) {
        this.rating_star = rating_star;
    }

    public String getRating_detail() {
        return rating_detail;
    }

    public void setRating_detail(String rating_detail) {
        this.rating_detail = rating_detail;
    }

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public String getGuest_mail() {
        return guest_mail;
    }

    public void setGuest_mail(String guest_mail) {
        this.guest_mail = guest_mail;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

}
