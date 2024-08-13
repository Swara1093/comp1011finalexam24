module com.example.comp1011finalexam {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.comp1011finalexam24 to javafx.fxml;
    exports com.example.comp1011finalexam24;
}
