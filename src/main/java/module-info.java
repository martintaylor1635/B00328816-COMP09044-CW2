module com.martintaylor {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.security.crypto;
    requires com.fasterxml.uuid;

    opens com.martintaylor to javafx.fxml;
    exports com.martintaylor;
}