package sample.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample1 extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);


        Button button2 = new Button("Go to scene1");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample1.fxml"));
//        Parent root = loader.load();
//        Scene scene = new Scene(root, 500, 500);
//        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        window.setScene(scene);
//        window.show();
    }
}
