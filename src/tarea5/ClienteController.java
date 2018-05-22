/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import domain.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Wilmata
 */
public class ClienteController implements Initializable {

    public static ArrayList<Cliente> listaCliente = new ArrayList<>();
    @FXML private TextField textFieldCliente;
    @FXML private TextField textFieldTelefono;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private void buttonReservar(ActionEvent event) {
        Cliente cliente = new Cliente(textFieldCliente.getText(), textFieldTelefono.getText());
        listaCliente.add(cliente);
        System.out.println(listaCliente.toString());
    }
  
}
