
package com.example.delivery_service.model;

public class Delivery {
    private String deliveryId;
    private String orderId;
    private String deliveryStatus;
    private String driverId;

    public Delivery() {
    }

    public Delivery(String deliveryId, String orderId, String deliveryStatus, String driverId) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
        this.driverId = driverId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}