
package com.example.driver_service.controller;

import com.example.driver_service.model.Driver;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @PostMapping("/assign")
    public Driver assignDriver(@RequestBody Driver driver) {
        return new Driver(
                "DR22",
                driver.getDeliveryId(),
                "CONFIRMED"
        );
    }

    @GetMapping("/{driverId}")
    public Driver getDriver(@PathVariable String driverId) {
        return new Driver(
                driverId,
                "D3001",
                "CONFIRMED"
        );
    }
}