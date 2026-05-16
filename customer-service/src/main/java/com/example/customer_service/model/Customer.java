
package com.example.customer_service.model;

public class Customer {
    private String customerId;
    private String fullName;
    private String phone;
    private String city;
    private String street;
    private String building;
    private String status;

    public Customer() {
    }

    public Customer(String customerId, String fullName, String phone, String city, String street, String building, String status) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.phone = phone;
        this.city = city;
        this.street = street;
        this.building = building;
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}