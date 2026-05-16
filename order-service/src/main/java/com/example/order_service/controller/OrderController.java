
package com.example.order_service.controller;

import com.example.order_service.model.OrderRequest;
import com.example.order_service.model.OrderResponse;
import com.example.order_service.model.PaymentRequest;
import com.example.order_service.model.PaymentResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        String orderId = "O9001";
        double totalAmount = 82.0;
        String currency = "ILS";

        PaymentRequest paymentRequest = new PaymentRequest(
                orderId,
                request.getCustomerId(),
                totalAmount,
                currency,
                request.getPaymentMethod()
        );

        PaymentResponse paymentResponse = restTemplate.postForObject(
                "http://localhost:8081/payments",
                paymentRequest,
                PaymentResponse.class
        );

        String orderStatus = "PLACED";
        String paymentStatus = "FAILED";

        if (paymentResponse != null && "SUCCEEDED".equals(paymentResponse.getPaymentStatus())) {
            paymentStatus = paymentResponse.getPaymentStatus();
        }

        return new OrderResponse(orderId, orderStatus, totalAmount, currency, paymentStatus);
    }
}