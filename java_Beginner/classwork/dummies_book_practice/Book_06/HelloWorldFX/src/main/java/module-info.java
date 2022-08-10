module com.example.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter1 to javafx.fxml;
    exports com.example.chapter1;
    opens com.example.chapter2 to javafx.fxml;
    exports com.example.chapter2;
    opens com.example.chapter3 to javafx.fxml;
    exports com.example.chapter3;
}