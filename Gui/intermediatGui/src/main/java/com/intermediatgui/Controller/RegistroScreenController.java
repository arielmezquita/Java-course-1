/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intermediatgui.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;



/**
 * FXML Controller class
 *
 * @author jpelegrino
 */
public class RegistroScreenController implements Initializable {

    @FXML private BorderPane mainLayout;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Inicializando Registro Screen Controller...");
    }


    @FXML
    public void cargarRegistroProfesor(ActionEvent evt) throws IOException {
        System.out.println("Registrando un Profesor");
        Parent profesorScene = FXMLLoader.load(getClass().getResource("/fxml/FXMLRegistroProfesor.fxml"));
        
        mainLayout.setCenter(profesorScene);
        
        
    }
    
}
