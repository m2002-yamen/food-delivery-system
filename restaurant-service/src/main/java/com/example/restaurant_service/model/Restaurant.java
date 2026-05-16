
package com.example.restaurant_service.model;

public class Restaurant {
    private String restaurantId;
    private String name;
    private String status;
    private String workingHours;
    private String deliveryCoverage;

    public Restaurant() {
    }

    public Restaurant(String restaurantId, String name, String status, String workingHours, String deliveryCoverage) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.status = status;
        this.workingHours = workingHours;
        this.deliveryCoverage = deliveryCoverage;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getDeliveryCoverage() {
        return deliveryCoverage;
    }

    public void setDeliveryCoverage(String deliveryCoverage) {
        this.deliveryCoverage = deliveryCoverage;
    }
}