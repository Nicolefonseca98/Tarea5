
package tarea5;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private ImageView table1ImageView;
    @FXML private ImageView table2ImageView;
    @FXML private ImageView table3ImageView;
    @FXML private ImageView table4ImageView;
    @FXML private ImageView table5ImageView;
    @FXML private ImageView table6ImageView;
    @FXML private ImageView table7ImageView;
    @FXML private ImageView table8ImageView;
    @FXML private AnchorPane anchorPanePrincipal;
    @FXML private GridPane mesasGridPane;

    
    
    
    
    
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
     
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    Image mesa1 = new Image("images/Libre.png");
    ImageView table1ImageView = new ImageView();
    table1ImageView.setImage(mesa1);
    
    Image mesa2 = new Image("images/Ocupada.png");
    ImageView table2ImageView = new ImageView();
    table2ImageView.setImage(mesa2);
    
    Image mesa3 = new Image("images/Libre.png");
    ImageView table3ImageView = new ImageView();
    table3ImageView.setImage(mesa3);
    
    Image mesa4 = new Image("images/Libre.png");
    ImageView table4ImageView = new ImageView();
    table4ImageView.setImage(mesa4);
    
    Image mesa5 = new Image("images/Libre.png");
    ImageView table5ImageView = new ImageView();
    table5ImageView.setImage(mesa5);
    
    Image mesa6 = new Image("images/Libre.png");
    ImageView table6ImageView = new ImageView();
    table6ImageView.setImage(mesa6);
    
    Image mesa7 = new Image("images/Libre.png");
    ImageView table7ImageView = new ImageView();
    table7ImageView.setImage(mesa7);
    
    Image mesa8 = new Image("images/Libre.png");
    ImageView table8ImageView = new ImageView();
    table8ImageView.setImage(mesa8);
    
    mesasGridPane.setConstraints(table1ImageView, 0, 0);
                mesasGridPane.getChildren().add(table1ImageView);
                
                 mesasGridPane.setConstraints(table2ImageView, 1, 0 );
                mesasGridPane.getChildren().add(table2ImageView);
                
                 mesasGridPane.setConstraints(table3ImageView, 1, 1);
                mesasGridPane.getChildren().add(table3ImageView);
                
                 mesasGridPane.setConstraints(table4ImageView, 1, 2);
                mesasGridPane.getChildren().add(table4ImageView);
                
                 mesasGridPane.setConstraints(table5ImageView, 0, 1);
                mesasGridPane.getChildren().add(table5ImageView);
                
                 mesasGridPane.setConstraints(table6ImageView, 0, 2);
                mesasGridPane.getChildren().add(table6ImageView);
                
                 mesasGridPane.setConstraints(table7ImageView, 0, 3);
                mesasGridPane.getChildren().add(table7ImageView);
                
                 mesasGridPane.setConstraints(table8ImageView, 0, 4);
                mesasGridPane.getChildren().add(table8ImageView);
    
//   mesasGridPane.getChildren().addAll(table1ImageView, table2ImageView,table3ImageView,table4ImageView,table5ImageView,table6ImageView,table7ImageView,table8ImageView);
    
   
    }    
    
}
