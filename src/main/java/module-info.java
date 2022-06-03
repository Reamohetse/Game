module com.example.gameassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gameassignment to javafx.fxml;
    exports com.example.gameassignment;
}