module com.example.gsondemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gsondemo to javafx.fxml;
    exports com.example.gsondemo;
}