
package com.example.order_service.model;

public class PaymentRequest {
    private String orderId;
    private String customerId;
    private double amount;
    private String currency;
    private String paymentMethod;

    public PaymentRequest() {
    }

    public PaymentRequest(String orderId, String customerId, double amount, String currency, String paymentMethod) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}