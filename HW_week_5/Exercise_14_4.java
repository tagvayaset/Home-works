package FxProjects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_4 extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        for(int i = 20; i <= 180; i = i + 40){
            Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC ,22);
            Text t = new Text(90, i,"Java");
            t.setFont(font);
            t.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            pane.getChildren().add(t);
        }
        pane.setRotate(90);
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.setTitle("Exercise_14_4");
        stage.show();
    }
}