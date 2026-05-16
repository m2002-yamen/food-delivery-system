
package com.example.menu_service.model;

public class MenuItem {
    private String itemId;
    private String restaurantId;
    private String name;
    private String category;
    private double price;
    private boolean available;

    public MenuItem() {
    }

    public MenuItem(String itemId, String restaurantId, String name, String category, double price, boolean available) {
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}