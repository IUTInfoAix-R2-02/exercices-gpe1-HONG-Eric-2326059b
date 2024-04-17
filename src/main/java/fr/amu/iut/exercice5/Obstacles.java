package fr.amu.iut.exercice5;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Scene;


public class Obstacles extends Personnage{

    private Rectangle rectangle;
    public Obstacles(){
        super("tkt",Color.AQUA,Color.WHITE);
        rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setFill(Color.PINK);
        super.getChildren().add(rectangle);
    }

}
