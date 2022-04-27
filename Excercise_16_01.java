package FxProjects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Excercise_16_01 extends Application {


    int i = 0;
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) {

        BorderPane borderPane = new BorderPane();
        final  ToggleGroup group = new ToggleGroup();
        String[] arr = {"Python", "C", "Java", "C++", "C#", "JavaScript", "PHP", "R"};

        Font font = Font.font("Times New Roman", FontWeight.BOLD, 42);
        Text text = new Text(arr[i]);
        text.setFont(font);

        RadioButton red = new RadioButton("red");
        RadioButton yellow = new RadioButton("yellow");
        RadioButton black = new RadioButton("black");
        RadioButton orange = new RadioButton("orange");
        RadioButton green = new RadioButton("green");

        red.setToggleGroup(group);
        yellow.setToggleGroup(group);
        black.setToggleGroup(group);
        orange.setToggleGroup(group);
        green.setToggleGroup(group);

        red.setOnAction(e -> text.setFill(Color.RED));
        yellow.setOnAction(e -> text.setFill(Color.YELLOW));
        black.setOnAction(e -> text.setFill(Color.BLACK));
        orange.setOnAction(e -> text.setFill(Color.ORANGE));
        green.setOnAction(e -> text.setFill(Color.GREEN));


        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(red, yellow, black, orange, green);

        Button right = new Button("=>");
        Button left = new Button("<=");

        right.setOnAction(e ->{
            if(i == arr.length-1){
                i = 0;
                text.setText(arr[i]);
            }
            if (i < arr.length-1){
                i++;
                text.setText(arr[i]);
            }
        });
        left.setOnAction(e -> {
            if(i >= 1) {
                i--;
                text.setText(arr[i]);
            }
            if(i == 0) {
                i = arr.length-1;
                text.setText(arr[i]);
            }
        });

        borderPane.setTop(hBox);

        borderPane.setCenter(new StackPane(text));

        borderPane.setRight(new StackPane(right));
        borderPane.setLeft(new StackPane(left));
        Scene scene = new Scene(borderPane, 300, 150);
        stage.setScene(scene);
        stage.show();

    }
}

