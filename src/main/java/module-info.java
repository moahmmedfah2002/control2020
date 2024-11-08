module com.ensa.exam2020 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.ensa.exam2020 to javafx.fxml;
    exports com.ensa.exam2020;
}