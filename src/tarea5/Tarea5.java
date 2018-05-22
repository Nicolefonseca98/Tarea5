
package tarea5;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lógica.AdministradorArchivos;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class Tarea5 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        //launch(args);
        AdministradorArchivos a = new AdministradorArchivos();
        a.leerArchivoMesa();
    }
    
}
