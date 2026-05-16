
package com.example.delivery_service.controller;

import com.example.delivery_service.model.Delivery;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @PostMapping
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return new Delivery(
                "D3001",
                delivery.getOrderId(),
                "ASSIGNED",
                "DR22"
        );
    }

    @GetMapping("/{deliveryId}")
    public Delivery getDelivery(@PathVariable String deliveryId) {
        return new Delivery(
                deliveryId,
                "O9001",
                "ASSIGNED",
                "DR22"
        );
    }
}