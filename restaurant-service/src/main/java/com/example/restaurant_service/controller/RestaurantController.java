
package com.example.restaurant_service.controller;

import com.example.restaurant_service.model.Restaurant;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping("/{restaurantId}")
    public Restaurant getRestaurant(@PathVariable String restaurantId) {
        return new Restaurant(
                restaurantId,
                "Pizza House",
                "OPEN",
                "10:00-23:00",
                "Gaza City"
        );
    }

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurant;
    }
}