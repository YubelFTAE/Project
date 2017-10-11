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
public class Product_Categories {

    private int category_id;
    private String category_name;
    private String category_detail;

    public Product_Categories() {
    }

    public Product_Categories(int category_id, String category_name, String category_detail) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_detail = category_detail;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_detail() {
        return category_detail;
    }

    public void setCategory_detail(String category_detail) {
        this.category_detail = category_detail;
    }

}
