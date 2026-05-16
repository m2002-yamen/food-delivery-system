
package com.example.customer_service.controller;

import com.example.customer_service.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable String customerId) {
        return new Customer(
                customerId,
                "Mohammed Aldeeb",
                "+970599000000",
                "Gaza",
                "Al-Nasr Street",
                "12",
                "ACTIVE"
        );
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customer;
    }
}