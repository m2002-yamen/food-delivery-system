
package com.example.order_service.model;

public class OrderResponse {
    private String orderId;
    private String status;
    private double totalAmount;
    private String currency;
    private String paymentStatus;

    public OrderResponse() {
    }

    public OrderResponse(String orderId, String status, double totalAmount, String currency, String paymentStatus) {
        this.orderId = orderId;
        this.status = status;
        this.totalAmount = totalAmount;
        this.currency = currency;
        this.paymentStatus = paymentStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}