
package com.example.payment_service.model;

public class PaymentResponse {
    private String paymentId;
    private String orderId;
    private String paymentStatus;
    private String transactionId;

    public PaymentResponse() {
    }

    public PaymentResponse(String paymentId, String orderId, String paymentStatus, String transactionId) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}