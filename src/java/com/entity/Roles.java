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
public class Roles {

    private int role_id;
    private String role_detail;

    public Roles() {
    }

    public Roles(int role_id, String role_detail) {
        this.role_id = role_id;
        this.role_detail = role_detail;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_detail() {
        return role_detail;
    }

    public void setRole_detail(String role_detail) {
        this.role_detail = role_detail;
    }

}
