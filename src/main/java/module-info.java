module com.example.comp1011finalexam24 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.comp1011finalexam24 to javafx.fxml, com.google.gson;
    exports com.example.comp1011finalexam24;
}