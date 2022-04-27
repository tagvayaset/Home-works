package com.example.hellofx;

import com.sun.javafx.css.StyleCacheEntry;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        Circle circle = new Circle(50);


        Pane pane = new Pane();
        Image gr = new Image("C:\\Users\\tagva\\Downloads\\Canva\\gr.png");
        ImageView grw = new ImageView(gr);
        grw.setFitHeight(200);
        grw.setFitWidth(200);

        Image canada = new Image("C:\\Users\\tagva\\Downloads\\Canva\\canada.png");
        ImageView canadaw = new ImageView(canada);
        canadaw.setFitHeight(200);
        canadaw.setFitWidth(200);
        canadaw.setX(200);
        canadaw.setY(0);

        Image usa = new Image("C:\\Users\\tagva\\Downloads\\Canva\\usa.png");
        ImageView usaw = new ImageView(usa);
        usaw.setFitHeight(200);
        usaw.setFitWidth(200);
        usaw.setX(200);
        usaw.setY(200);

        Image china = new Image("C:\\Users\\tagva\\Downloads\\Canva\\china.png");
        ImageView chinaw = new ImageView(china);
        chinaw.setFitHeight(200);
        chinaw.setFitWidth(200);
        chinaw.setX(0);
        chinaw.setY(200);

        pane.getChildren().add(grw);
        pane.getChildren().add(usaw);
        pane.getChildren().add(canadaw);
        pane.getChildren().add(chinaw);

        Scene scene = new Scene(pane, 400, 400);


        stage.setScene(scene);
        stage.setTitle("Exercise_14_1");
        stage.show();


    }
}