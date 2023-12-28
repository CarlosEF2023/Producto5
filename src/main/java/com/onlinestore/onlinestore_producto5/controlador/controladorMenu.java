package com.onlinestore.onlinestore_producto5.controlador;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class controladorMenu implements Initializable  {

    private Stage stage = new Stage();
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane content;

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
        switchscene(event, "/frmaltaarticulo.fxml");
    }

    @FXML
    void clk_insertarcliente(ActionEvent event) throws IOException {
        switchscene(event, "/frmcliente.fxml");
    }

    @FXML
    void clk_insertarpedido(ActionEvent event) throws IOException {
        switchscene(event, "/frmpedido.fxml");
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
    void clk_mostrartodosarticulos(ActionEvent event) throws IOException {
        switchscene(event, "/frmlistararticulos.fxml");
    }

    @FXML
    void clk_mostrartodosclientes(ActionEvent event) throws IOException {
        switchscene(event, "/frmmostrarclientes.fxml");
    }

    @FXML
    void clk_mostrartodospedidos(ActionEvent event) throws IOException {
        switchscene(event, "/frmmostrarclientes.fxml");
    }

    @FXML
    void clk_salir(ActionEvent event) {
        Platform.exit();
        System.exit(0);
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

    public void switchscene(ActionEvent event, String formulario) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(formulario));
            root = loader.load();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}