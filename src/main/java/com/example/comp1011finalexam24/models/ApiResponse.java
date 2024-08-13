package com.example.comp1011finalexam24.models;
import java.util.List;

public class ApiResponse {
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
