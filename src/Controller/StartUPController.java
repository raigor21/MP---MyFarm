/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Farmer;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author BEAST
 */
public class StartUPController {
    @FXML
    private Button  enter_button;
    @FXML
    private TextField username_field;
    @FXML
    private Label welcome;
    
    private Farmer farmer;
    
    
    public void initialize() {
        enter_button.setOnAction(event -> {
           if(username_field.getText().isEmpty()) {
              welcome.setText("Please try again");
           }
           else {
               try {
                  FXMLLoader load = new FXMLLoader(StartUPController.this.getClass().getResource("/view/FXMLDocument.fxml"));
                  Parent root = (Parent) load.load();
                  
                  Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                  Scene scene = new Scene(root, 800, 600);
                  stage.setScene(scene);
                  stage.show();
                  FXMLDocumentController controller = load.<FXMLDocumentController>getController();
                  
                   farmer = new Farmer(username_field.getText());
                   controller.setFarmer(farmer);
               }  
               catch(IOException e) {}
           }
        });
    }
}
