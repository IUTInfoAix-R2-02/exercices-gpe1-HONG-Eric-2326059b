package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane Bo = new BorderPane();
        Separator sep1 = new Separator();
        Separator sep2 = new Separator();
        sep2.setOrientation(Orientation.VERTICAL);

        //3 button
        VBox vboxB = new VBox();
        Label l2 = new Label("Button :");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        vboxB.getChildren().addAll(l2,b1,b2,b3);


        //Menu
        HBox topbox = new HBox();
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        topbox.getChildren().add(menuBar);
        //Bas de page
        HBox bottombox = new HBox();
        Label l1 = new Label("Ceci est un label de bas de page");
        bottombox.getChildren().add(l1);


        //Formulaire
        Label l3 = new Label("Name:");
        Label l4 = new Label("Email:");
        Label l5 = new Label("Password:");
        Button b4 = new Button("Submit");
        Button b5 = new Button("Cancel");
        TextField textfield = new TextField();
        GridPane G1 = new GridPane();
        G1.add(l3 ,1,1);
        G1.add(l4 ,1,2);
        G1.add(l5 ,1,3);
        G1.add(new TextField(),2,1);
        G1.add(new TextField(),2,2);
        G1.add(new TextField(),2,3);
        G1.add(b4,1,4);
        G1.add(b5,2,4);
        G1.setHgap(5);
        G1.setVgap(5);

        //Scene
        Scene s = new Scene(Bo);
        primaryStage.setScene(s);
        primaryStage.setWidth( 600 );
        primaryStage.setHeight( 450 );
        vboxB.setAlignment(Pos.CENTER);
        bottombox.setAlignment(Pos.BOTTOM_CENTER);
        topbox.setAlignment(Pos.TOP_LEFT);
        G1.setAlignment(Pos.CENTER);
        Bo.setTop(topbox);
        Bo.setLeft(vboxB);
        Bo.setBottom(bottombox);;
        Bo.setCenter(G1);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

