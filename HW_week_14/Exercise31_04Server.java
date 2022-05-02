package HW_week_14;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
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
import java.net.ServerSocket;
import java.net.Socket;

public class Exercise31_04Server extends Application {


    int clientNo = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root = new StackPane();

        VBox vBox = new VBox(5);
        vBox.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(new StackPane(vBox));

        root.getChildren().addAll(borderPane);

        new Thread(() -> {
            try {
                ServerSocket server = new ServerSocket(2022);

                while (true) {
                    try {
                        System.out.println("Waiting for incomes");
                        Socket socket = server.accept();
                        System.out.println(clientNo + " Client is Connected!");

                        new Thread(() -> {
                            try {
                                DataInputStream fromClient = new DataInputStream(socket.getInputStream());
                                DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());

                                toClient.writeUTF("You are " + clientNo);
                                    Label nLbl = new Label(clientNo + " Thread");
                                    nLbl.setStyle(" -fx-text-fill: white; -fx-font-size: 30; -fx-background-color: rgba(165,245,27,0.54); -fx-background-radius: 10;" );
                                    nLbl.setTextFill(Color.WHITE);
                                    nLbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

                                    Platform.runLater(() -> {
                                                vBox.getChildren().add(nLbl);
                                            });

                            } catch (IOException e) {

                            }

                        }).start();
                        clientNo++;
//        }
                    } catch (IOException e) {

                    }
                }
            } catch (IOException e) {

            }

        }).start();

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle("Server");
        primaryStage.show();

    }
}