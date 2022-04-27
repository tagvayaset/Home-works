package FxProjects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_14_2 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane pane = new GridPane();

        int r = (int) (Math.random() * 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (r == 1) {
                    pane.add(new ImageView(new Image("C:\\Users\\tagva\\Downloads\\Canva\\XX.gif")), i, j);
                    r = (int) (Math.random() * 3);
                    continue;
                } else if (r == 2) {
                    pane.add(new ImageView(new Image("C:\\Users\\tagva\\Downloads\\Canva\\OO.gif")), i, j);
                    r = (int) (Math.random() * 3);
                    continue;
                } else {
                    r = (int) (Math.random() * 3);
                }
            }
        }

        Scene scene = new Scene(pane, 820, 600);
        stage.setScene(scene);
        stage.setTitle("Exercise_14_2");
        stage.show();
    }
}
