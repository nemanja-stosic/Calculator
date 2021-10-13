package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {

    @Override
    public void start(Stage window) throws IOException {
        window.setTitle("Calculator");
        window.setScene(createMainScene(loadMainPane()));
        window.setResizable(false);
        window.show();
    }

    private Scene createMainScene(Pane mainPane) {
        Scene scene = new Scene(mainPane);
        scene.getStylesheets().setAll(Objects.requireNonNull(getClass().getResource("css/DarkTheme.css")).toExternalForm());
        return scene;
    }

    private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        return loader.load(getClass().getResourceAsStream("view/MainWindow.fxml"));
    }

    public static void main(String[] args) {
        launch(args);
    }

}