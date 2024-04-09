package com.example.partie1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MaPremiereClasseJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        Button b = new Button("Canard");
        Scene s = new Scene(b,500,500);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}

