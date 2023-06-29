module com.se233.chapter1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.se233.chapter1 to javafx.fxml;
    exports com.se233.chapter1;
}