/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import Model.Farmer;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author BEAST
 */
public class FXMLDocumentController {
    
    private Farmer farmer;
    
    @FXML
    private Label name;
    @FXML
    private Label balance;
    @FXML
    private Label type;
    @FXML
    private Label exp;
    @FXML
    private Label level;
    @FXML
    private TextArea dialog;
    @FXML
    private Button water_button;
    @FXML
    private Button fertilizer_button;
    @FXML
    private Button harvest_button;
    @FXML
    private Button plow_button;
    @FXML
    private Button pickaxe_button;
    @FXML
    private Button seed_button;
    
    public void setFarmer(Farmer farmer){
        this.farmer = farmer;
        name.setText(this.farmer.getName());
        type.setText(this.farmer.getLevelClass().getType());
        exp.setText(Integer.toString(this.farmer.getLevelClass().getXp()));
        balance.setText(Integer.toString(this.farmer.getCoins()));
        level.setText(Integer.toString(this.farmer.getLevelClass().getLevel()));
    }
    
   public void printDialog(){
        water_button.setOnAction(event ->{
            dialog.setText("Water is good for plants to be hydrated :D");       
        });
        fertilizer_button.setOnAction(even ->{
            dialog.setText("Fertilizes the tile to keep it nutritious");
        });
        harvest_button.setOnAction(even ->{
            dialog.setText("Use this to harvest your plant!");
        });
        plow_button.setOnAction(even ->{
            dialog.setText("Prepares a tile for planting! wohoo!");
        });
        pickaxe_button.setOnAction(even ->{
            dialog.setText("Remove the rocks!");
        });
        seed_button.setOnAction(even ->{
            dialog.setText("Choose your seed!");
        });
        
   }

           
}
    

