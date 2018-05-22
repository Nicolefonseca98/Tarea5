/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import domain.Producto;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lógica.AdministradorArchivos;
import org.json.simple.parser.ParseException;


/**
 * FXML Controller class
 *
 * @author Wilmata
 */
public class CuentaController implements Initializable {

    @FXML private TextField textFieldMenu;
    @FXML private ComboBox comboBoxMenu;
    @FXML private TableView tableMenu;
    @FXML private TableColumn tableColumnPrecio;
    @FXML private TableColumn tableColumnProducto;
    public static ObservableList<Producto> menuLista = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
       AdministradorArchivos administradorArchivos = new AdministradorArchivos();
        try { 
            ArrayList <Producto> menu = administradorArchivos.leerArchivoMenu();
            for (int i = 0; i < menu.size(); i++) {
                menuLista.add(menu.get(i));
                String nombreProducto = menu.get(i).getNombre();
             comboBoxMenu.getItems().addAll(nombreProducto);    
             tableColumnProducto.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombre"));
            tableColumnPrecio.setCellFactory(new PropertyValueFactory<Producto, String>("precio"));
            tableMenu.setItems(menuLista);
            }
        } catch (IOException ex) {
            Logger.getLogger(CuentaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CuentaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//       tableColumnProducto.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombre"));
//        columnaAutor.setCellValueFactory(new PropertyValueFactory<Libro, String>("autor"));
//        columnaIngreso.setCellValueFactory(new PropertyValueFactory<Libro, String>("fechaIngreso"));

    }    
    
}
