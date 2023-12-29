package com.onlinestore.onlinestore_producto5.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

import java.io.IOException;


public class GestionOS extends Application {

    public Stage currentStage;
    public Scene scene;
    public Parent root;

    @Override
    public void start(Stage stage) throws IOException {
        // set up the scene
        try{
            this.root = FXMLLoader.load(getClass().getResource("/login.fxml"));
            Scene scene = new Scene(this.root);
            stage.resizableProperty().setValue(true);
            stage.setMaximized(false);
            stage.setTitle("OnlineStore");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void cerrarventana(Stage stage){
        stage.close();
    }

    public static void main(String[] args) {
        launch();
    }
}