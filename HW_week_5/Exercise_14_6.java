package FxProjects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Collection;

public class Exercise_14_6 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        for(int i = 40; i <= 280; i = i + 80){
            for(int j = 0; j <= 280; j = j + 80){
                Rectangle rectangle1 = new Rectangle(40, 40);
                Rectangle rectangle2 = new Rectangle(40, 40);
                rectangle1.setX(i);
                rectangle1.setY(j);
                rectangle2.setX(i - 40);
                rectangle2.setY(j + 40);
                rectangle1.setFill(Color.BLACK);
                pane.getChildren().addAll(rectangle1, rectangle2);
            }
        }

        Scene scene = new Scene(pane, 320, 320);
        primaryStage.setTitle("Chess board Ex14_6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
