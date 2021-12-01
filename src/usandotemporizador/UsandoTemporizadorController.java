/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandotemporizador;

import campotemporizador.Temporizador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author frang
 */
public class UsandoTemporizadorController implements Initializable {

    @FXML
    private Label labelMostrar;
   
    @FXML
    private Temporizador temporizador;
    private Integer segundos = 5;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       temporizador.setTime(segundos);
       temporizador.iniciarContador();
    }

    @FXML
    private void onFinished(ActionEvent event) {
        labelMostrar.setText("Se termino el tiempo");
    }
    
    
}
