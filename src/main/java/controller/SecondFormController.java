package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SecondFormController {
    public void initialize(){
        Timeline timeline = new Timeline();
        var keyFrame1 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        }

        var keyFrame2 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    URL resource = this.getClass().getResource("/view/TextEditorForm.fxml");
                    Parent container = FXMLLoader.load(resource);
                    Scene editorScene = new Scene(container);
                    Stage primaryStage = new Stage();
                    primaryStage.setScene(editorScene);
                    primaryStage.show();
                    primaryStage.centerOnScreen();

                } catch (IOException e) {
                    throw new RuntimeException()
                }
            }
        });
    }
}
