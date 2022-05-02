package HW_week_14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Exercise31_04Client extends Application {

        private Stage window;
        private final double W = 600., H = 600;


        private Socket socket;
        private DataOutputStream toServer;
        private DataInputStream fromServer;

        private void connectToServer() throws IOException {
                socket = new Socket("localhost", 2022);
                toServer = new DataOutputStream(socket.getOutputStream());
                fromServer = new DataInputStream(socket.getInputStream());
        }

        @Override
        public void start(Stage primaryStage) throws Exception {

                connectToServer();

                Label label = new Label(fromServer.readUTF());
                label.setStyle(" -fx-text-fill: white; -fx-font-size: 30; -fx-background-color: rgba(165,245,27,0.54); -fx-background-radius: 10;" );

                Pane root =new Pane();
                root.getChildren().addAll(label);


                window = primaryStage;
                window.setScene(new Scene(root,400,400));
                window.show();

        }
}
