package com.example.payment_service.controller;

import com.example.payment_service.model.PaymentRequest;
import com.example.payment_service.model.PaymentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping
    public PaymentResponse processPayment(@RequestBody PaymentRequest request) {
        return new PaymentResponse(
                "P7001",
                request.getOrderId(),
                "SUCCEEDED",
                "T88771"
        );
    }
}