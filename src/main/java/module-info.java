module com.example.workshop_11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshop_11 to javafx.fxml;
    exports com.example.workshop_11;
}