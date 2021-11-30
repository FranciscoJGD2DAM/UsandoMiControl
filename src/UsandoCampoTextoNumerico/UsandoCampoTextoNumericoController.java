/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsandoCampoTextoNumerico;

import campotextonumerico.CampoTextoNumerico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class UsandoCampoTextoNumericoController implements Initializable {

    @FXML
    private Label mostrar;
    @FXML
    private CampoTextoNumerico insertarEdad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void onActionEdad(ActionEvent event) {
        int edad = Integer.valueOf(insertarEdad.getText());
        if(edad < 18){
            mostrar.setStyle("-fx-border-width:bold; -fx-text-fill: red");
            mostrar.setText("Tienes " +edad +"años. Eres menor de edad");
        }else{
            mostrar.setStyle("-fx-border-width:bold; -fx-text-fill: green");
            mostrar.setText("Tienes " +edad +"años. Eres mayor de edad");
        }
        
    }
    
}
