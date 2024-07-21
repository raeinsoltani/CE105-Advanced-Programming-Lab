package com.example.TicTacToe;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 600);
        stage.setTitle("TicTacToe");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:resources/icon/icon.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}