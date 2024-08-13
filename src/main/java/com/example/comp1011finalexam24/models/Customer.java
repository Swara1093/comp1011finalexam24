package com.example.comp1011finalexam24.models;

import java.util.List;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private List<Product> purchasedProducts;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public List<Product> getPurchasedProducts() { return purchasedProducts; }
    public void setPurchasedProducts(List<Product> purchasedProducts) { this.purchasedProducts = purchasedProducts; }

    // Calculate total purchases
    public double getTotalPurchases() {
        return purchasedProducts.stream().mapToDouble(Product::getSalePrice).sum();
    }

    // Calculate total savings
    public double getTotalSavings() {
        return purchasedProducts.stream().mapToDouble(p -> p.getRegularPrice() - p.getSalePrice()).sum();
    }

    // Check if customer saved $5 or more
    public boolean hasSavedFiveOrMore() {
        return getTotalSavings() >= 5;
    }
}
