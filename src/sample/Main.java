package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SeniorQuery.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, root.getLayoutX(), root.getLayoutY()));
        primaryStage.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        primaryStage.setX((screenSize.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((screenSize.getHeight() - primaryStage.getHeight()) / 2);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
