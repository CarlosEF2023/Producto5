package com.onlinestore.onlinestore_producto5.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class GestionOS extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // set up the scene
        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("menuinicial.fxml"));
            stage.resizableProperty().setValue(false);
            stage.setTitle("OnlineStore");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        launch(args);
    }
}