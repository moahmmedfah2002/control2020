package com.ensa.exam2020;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        CommercialController commercialController = new CommercialController();
        ProduitController produitController = new ProduitController();
        commercialController.start();
        produitController.start();
    }

    public static void main(String[] args) {
        launch();
    }
}