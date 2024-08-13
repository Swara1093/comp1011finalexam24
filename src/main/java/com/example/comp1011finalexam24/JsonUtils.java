package com.example.comp1011finalexam24;

import com.example.comp1011finalexam24.models.ApiResponse;
import com.example.comp1011finalexam24.models.Customer;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonUtils {

    public static List<Customer> parseCustomers(String filePath) {
        Gson gson = new Gson();
        try (JsonReader reader = new JsonReader(new FileReader(filePath))) {
            ApiResponse response = gson.fromJson(reader, ApiResponse.class);
            return response.getCustomers();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
