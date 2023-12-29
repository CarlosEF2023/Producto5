module com.onlinestore.onlinestore_producto {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens com.onlinestore.onlinestore_producto5 to javafx.fxml;
    exports com.onlinestore.onlinestore_producto5;
    exports com.onlinestore.onlinestore_producto5.vista;
    opens com.onlinestore.onlinestore_producto5.vista to javafx.fxml;
    exports controlador;
    opens controlador to javafx.fxml;
}