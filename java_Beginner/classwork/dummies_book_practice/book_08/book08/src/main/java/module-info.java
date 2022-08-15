module com.example.book08 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book08 to javafx.fxml;
    exports com.example.book08;
}