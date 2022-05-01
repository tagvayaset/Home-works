package FxProjects;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.sql.Time;

public class Excercise_15_29 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Pane pane = new Pane();

        Rectangle big = new Rectangle(100, 20);
        Circle wheel1 = new Circle(10);
        Circle wheel2 = new Circle(10);
        Rectangle small = new Rectangle(20, 20);

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(0.0, 0.0,
                0.0, 20.0,
                20.0, 20.0);
        Polygon polygon2 = new Polygon();
        polygon2.getPoints().addAll(0.0, 0.0,
                0.0, 20.0,
                20.0, 20.0);
        polygon.setRotate(270);

        HBox hBox = new HBox();
        Font font = Font.font(20);


        polygon.setFill(Color.LIGHTGREEN);
        small.setFill(Color.LIGHTGREEN);
        polygon2.setFill(Color.LIGHTGREEN);
        big.setFill(Color.GREENYELLOW);

        hBox.getChildren().addAll(new Label("     "), polygon, small, polygon2);

        HBox HBoxW = new HBox(20);
        HBoxW.getChildren().addAll(new Label(""), wheel1, wheel2);

        VBox vBox = new VBox();                                               // машина
        vBox.getChildren().addAll(hBox, big, HBoxW);

        pane.getChildren().add(vBox);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(pane);

        Button play = new Button("play");
        Button stop = new Button("stop");
        Button increase = new Button("increase");
        Button decrease = new Button("decrease");

        Scene scene = new Scene(borderPane, 700, 100);
        Tim r = new Tim();

        Duration duration = new Duration(5);
        Timeline timeline = new Timeline(new KeyFrame(duration, e -> {

            if (Tim.i >= scene.getWidth()) {
                r.reset();
            }

            Tim.i = Tim.i + Add.i;
            vBox.setLayoutX(Tim.i);

            increase.setOnAction(ev -> {
                Add.i = Add.i * 2;
            });

            decrease.setOnAction(ev -> {
                Add.i = Add.i / 2;
            });
        }));

        timeline.setCycleCount(-1);

        play.setOnAction(e -> timeline.play());
        stop.setOnAction(e -> timeline.stop());


        HBox hBox1 = new HBox(20);
        hBox1.getChildren().addAll(play, stop, increase, decrease);

        borderPane.setBottom(new StackPane(hBox1));

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    class Tim {
        public static Double i = 0.;

        void reset() {
            i = 0.;
        }
    }
    class Add{
        public  static Double i = 1.;
    }
}
