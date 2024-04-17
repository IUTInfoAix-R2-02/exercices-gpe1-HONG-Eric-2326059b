package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane B = new BorderPane();

        HBox H2 = new HBox();
        Label L = new Label("Couleur");
        H2.getChildren().add(L);
        H2.setAlignment(Pos.CENTER);


        //Hbox + button
        HBox H = new HBox();
        Button B1 = new Button("Vert");
        Button B2 = new Button("Rouge");
        Button B3 = new Button("Bleu");
        H.getChildren().addAll(B1,B2,B3);
        H.setAlignment(Pos.CENTER);

        Pane P = new Pane();
        B1.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {P.setStyle("-fx-background-color:Green;"); L.setText("Vert");});
        B2.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {P.setStyle("-fx-background-color:Red;");L.setText("Rouge");});
        B3.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {P.setStyle("-fx-background-color:Blue;");L.setText("Bleu");});

        //
        B.setTop(H2);
        B.setBottom(H);
        B.setCenter(P);

        Scene S = new Scene(B);
        primaryStage.setScene(S);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}

