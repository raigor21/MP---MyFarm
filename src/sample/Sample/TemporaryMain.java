package sample.View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TemporaryMain extends Application {

    Stage window;

    public static void main (String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("MyFarm - Farming Simulator");

        VBox rightMenu = new VBox();
        Button buttonSeeds = new Button("Seeds");
        Button buttonPlow = new Button("Plow");
        Button buttonWater = new Button("Watering Can");
        Button buttonPick = new Button("Pickaxe");
        rightMenu.setSpacing(10);
        rightMenu.setAlignment(Pos.CENTER_RIGHT);
        rightMenu.getChildren().addAll(buttonSeeds, buttonPlow, buttonWater, buttonPick);

        VBox leftMenu = new VBox();
        Label farmerName = new Label("Jerick");
        Label xp = new Label("XP: 0 / 100");
        Label type = new Label("Farmer");
        Label coins = new Label ("Coins: 1000");
        leftMenu.setSpacing(10);
        leftMenu.setAlignment(Pos.CENTER_LEFT);
        leftMenu.getChildren().addAll(farmerName, xp, type, coins);

        GridPane field = new GridPane();
        field.setPadding(new Insets(10, 10 , 10, 10));
        field.setVgap(10);
        field.setHgap(18);
        field.setAlignment(Pos.CENTER);
        Button[] tile = new Button[50];

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                tile[i] = new Button();
                field.add(tile[i], j, i);
            }
        }


        BorderPane borderPane = new BorderPane();
        borderPane.setRight(rightMenu);
        borderPane.setLeft(leftMenu);
        borderPane.setCenter(field);

        Scene scene = new Scene(borderPane, 600, 400);
        window.setScene(scene);
        window.show();
    }
}
