package com.example.javafx_player;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private MediaView mediaView;
    @FXML
    private Button playButton;
    @FXML
    private Slider sliderVolume, sliderTime;
    @FXML
    private Label time;
    @FXML
    private AnchorPane panel;
    
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("C:\\Users\\tagva\\Desktop\\Activity_16.24.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaPlayer.volumeProperty().bind(sliderVolume.valueProperty());
        mediaPlayer.setOnReady(new Runnable() {
                                   @Override
                                   public void run() {sliderTime.setMax((int)media.getDuration().toSeconds());}});

        time.setText((int)mediaPlayer.getCurrentTime().toSeconds() + "/" + sliderTime.getMax());
        mediaPlayer.currentTimeProperty().addListener(e -> {
            if (!sliderTime.isValueChanging()) {
                sliderTime.setValue(mediaPlayer.getCurrentTime().toSeconds());
            }
            time.setText(getDur(mediaPlayer.getCurrentTime().toSeconds()) + "/" + getDur(sliderTime.getMax()));
        });
    }
    public void playMedia(){
        if(playButton.getText().equals(" ▶ ")) {
            mediaPlayer.play();
            playButton.setText(" | | ");
        }else{
            mediaPlayer.pause();
            playButton.setText(" ▶ ");
        }
    }
    public void slTime() {
        mediaPlayer.seek(Duration.seconds(sliderTime.getValue()));
    }
    public void showPanel(){
        panel.setVisible(true);
    }

    public String getDur(Double d){

        int h = (int)(d/3600);
        int m = (int)((d - (h* 3600))/60);
        int s = (int)((d - (h* 3600))- (m * 60));

        return h + ":" + m  +":"+ s;
    }
}