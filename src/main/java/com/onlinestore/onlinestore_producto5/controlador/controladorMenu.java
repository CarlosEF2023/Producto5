package com.onlinestore.onlinestore_producto5.controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class controladorMenu implements Initializable  {

    @FXML
    void clk_acercade(ActionEvent event) {

    }

    @FXML
    void clk_buscararticulo(ActionEvent event) {

    }

    @FXML
    void clk_buscarcliente(ActionEvent event) {

    }

    @FXML
    void clk_buscarpedido(ActionEvent event) {

    }

    @FXML
    void clk_editararticulo(ActionEvent event) {

    }

    @FXML
    void clk_editarcliente(ActionEvent event) {

    }

    @FXML
    void clk_eliminararticulo(ActionEvent event) {

    }

    @FXML
    void clk_eliminarcliente(ActionEvent event) {

    }

    @FXML
    void clk_eliminarpedido(ActionEvent event) {

    }

    @FXML
    void clk_insertararticulo(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root;
        root = FXMLLoader.load(getClass().getResource("frm_articulo.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void clk_insertarcliente(ActionEvent event) {

    }

    @FXML
    void clk_insertarpedido(ActionEvent event) {

    }

    @FXML
    void clk_listaestandar(ActionEvent event) {

    }

    @FXML
    void clk_listapremium(ActionEvent event) {

    }

    @FXML
    void clk_listarenviados(ActionEvent event) {

    }

    @FXML
    void clk_listarpendientes(ActionEvent event) {

    }

    @FXML
    void clk_mostrartodosarticulos(ActionEvent event) {

    }

    @FXML
    void clk_mostrartodosclientes(ActionEvent event) {

    }

    @FXML
    void clk_mostrartodospedidos(ActionEvent event) {

    }

    @FXML
    void clk_salir(ActionEvent event) {

    }


    // -----------------------------
    @FXML
    void clk_articulo(ActionEvent event) {

    }

    @FXML
    void clk_cliente(ActionEvent event) {

    }

    @FXML
    void clk_pedido(ActionEvent event) {

    }

    public void initialize(URL location, ResourceBundle resources){
        // Podemos crear los eventos aquí dentro.
    }

}