/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author ngquangdat
 */
public class Products {

    private int product_id;
    private String product_name;
    private String product_detail;
    private String product_img;
    private String product_provider;
    private float product_price;
    private String product_status;
    private String category_id;

    public Products(int product_id, String product_name, String product_detail, String product_img, String product_provider, float product_price, String product_status, String category_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_detail = product_detail;
        this.product_img = product_img;
        this.product_provider = product_provider;
        this.product_price = product_price;
        this.product_status = product_status;
        this.category_id = category_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getProduct_provider() {
        return product_provider;
    }

    public void setProduct_provider(String product_provider) {
        this.product_provider = product_provider;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public String getProduct_status() {
        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public Products() {
    }

}
