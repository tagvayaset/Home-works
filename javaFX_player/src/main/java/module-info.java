module com.example.javafx_player {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.javafx_player to javafx.fxml;
    exports com.example.javafx_player;
}