
package com.example.menu_service.controller;

import com.example.menu_service.model.MenuItem;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @GetMapping("/items/{itemId}")
    public MenuItem getMenuItem(@PathVariable String itemId) {
        return new MenuItem(
                itemId,
                "R210",
                "Chicken Pizza",
                "Pizza",
                35.0,
                true
        );
    }

    @PostMapping("/items")
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItem;
    }
}