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
public class Employees {

    private int employee_id;
    private  String employee_name;
    private  String employee_address;
    private  String employee_phone;
    private String employee_other;
    private String username;

    public Employees() {
    }
    

    public Employees(int employee_id, String employee_name, String employee_address, String employee_phone, String employee_other, String username) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_address = employee_address;
        this.employee_phone = employee_phone;
        this.employee_other = employee_other;
        this.username = username;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_other() {
        return employee_other;
    }

    public void setEmployee_other(String employee_other) {
        this.employee_other = employee_other;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
