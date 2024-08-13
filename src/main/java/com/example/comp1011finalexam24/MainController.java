package com.example.comp1011finalexam24;

import com.example.comp1011finalexam24.models.Customer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.util.List;

public class MainController {
    @FXML
    private TableView<Customer> customerTableView;
    @FXML
    private TableColumn<Customer, Integer> idColumn;
    @FXML
    private TableColumn<Customer, String> firstNameColumn;
    @FXML
    private TableColumn<Customer, String> lastNameColumn;
    @FXML
    private TableColumn<Customer, String> phoneColumn;
    @FXML
    private TableColumn<Customer, Double> totalPurchasesColumn;
    @FXML
    private Label rowsInTableLabel;
    @FXML
    private void top10Customers(ActionEvent event) {
        System.out.println("Top 10 Customers button clicked.");
    }

    @FXML
    private void customersSavedOver5(ActionEvent event) {
        System.out.println("Customers who saved over $5 button clicked.");
    }

    @FXML
    private void loadAllCustomers(ActionEvent event) {
        System.out.println("All Customers button clicked.");
    }
    private ObservableList<Customer> customerList;



        public void initialize() {
        // Configure columns
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        totalPurchasesColumn.setCellValueFactory(new PropertyValueFactory<>("totalPurchases"));

        // Load customers
        List<Customer> customers = JsonUtils.parseCustomers("src/main/resources/com/example/comp1011finalexam24/customers.json");
        customerList = FXCollections.observableArrayList(customers);
        customerTableView.setItems(customerList);

        // Update rows label
        updateRowsLabel();
    }


    private void updateRowsLabel() {
        rowsInTableLabel.setText("Rows returned: " + customerTableView.getItems().size());
    }
}
