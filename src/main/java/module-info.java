module com.martintaylor {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.martintaylor to javafx.fxml;
    exports com.martintaylor;
}