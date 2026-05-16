
package com.example.driver_service.model;

public class Driver {
    private String driverId;
    private String deliveryId;
    private String assignmentStatus;

    public Driver() {
    }

    public Driver(String driverId, String deliveryId, String assignmentStatus) {
        this.driverId = driverId;
        this.deliveryId = deliveryId;
        this.assignmentStatus = assignmentStatus;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }
}