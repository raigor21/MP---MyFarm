package sample.View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.*;

public class Temporary extends Application {

    Stage window;
    Label label, label1;
    TextField textField;
    Button button;

    public static void main (String[] args)
    {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("MyFarm - Farming Simulator");

        label = new Label("Welcome to My Farm!");
        label1 = new Label("Enter your name: ");
        textField = new TextField();
        button = new Button("Click here");

        Pane layout = new Pane();
        layout.getChildren().addAll(label, label1, textField, button);
        Scene scene = new Scene(layout, 450, 300);
        window.setScene(scene);
        window.show();

    }
}
