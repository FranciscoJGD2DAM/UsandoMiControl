/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandocampotextoboton;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import campotextoboton.CampoTextoBoton;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author usuario
 */
public class UsandoCampoTextoBoton extends Application {
    
   @Override
    public void start(Stage primaryStage) throws Exception {
        CampoTextoBoton campotextoboton = new CampoTextoBoton();
        
        campotextoboton.setText("Hello");
        
        primaryStage.setScene(new Scene(campotextoboton));
        
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
