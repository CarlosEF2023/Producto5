module com.onlinestore.onlinestore_producto5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens com.onlinestore.onlinestore_producto5 to javafx.fxml;
    exports com.onlinestore.onlinestore_producto5;
}