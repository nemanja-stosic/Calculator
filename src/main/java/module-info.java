module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.lang3;

    opens main to javafx.fxml;
    exports main;
}
