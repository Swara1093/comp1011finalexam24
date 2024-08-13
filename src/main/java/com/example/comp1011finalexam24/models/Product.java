package com.example.comp1011finalexam24.models;

public class Product {
    private String sku;
    private String name;
    private double salePrice;
    private double regularPrice;
    private String imageUrl;

    // Getters and Setters
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalePrice() { return salePrice; }
    public void setSalePrice(double salePrice) { this.salePrice = salePrice; }

    public double getRegularPrice() { return regularPrice; }
    public void setRegularPrice(double regularPrice) { this.regularPrice = regularPrice; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    @Override
    public String toString() {
        return name + "-$" + salePrice;
    }
}
