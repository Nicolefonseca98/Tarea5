/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Nicole
 */
public class Logica {
    
ImageView[][] matrizImageView;

    public GridPane dibujaMesas(GridPane gridPane) throws IOException, FileNotFoundException, ParseException {
 
        matrizImageView = new ImageView[2][4];
        Image matrizImages[][] = new Image[2][4];
        int columna = 0;
        int fila = 0;
        for (int i = 0; i < matrizImages.length; i++) {
            columna = 0;
            for (int j = 0; j < matrizImages[0].length; j++) {
                matrizImages[i][j] = new Image("/images/Libre.png");
                matrizImageView[i][j] = new ImageView();
                matrizImageView[i][j].setImage(matrizImages[i][j]);

                GridPane.setConstraints(matrizImageView[i][j], columna, fila);
                columna++;
                gridPane.getChildren().add(matrizImageView[i][j]);
            }
            fila++;
        }
        return gridPane;
    }
    
    public void detectaClickMapa(GridPane gridPane) {
  
        for (int i = 0 ; i < matrizImageView.length ; i++) {
            for (int j = 0 ; j < matrizImageView[0].length ; j++) {
             int auxI = i;
                int auxJ = j;    
                matrizImageView[i][j].setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) { 
                        System.out.println("mesa en la posición " + auxI +" "+ auxJ);
                        
                    }
                });            
            }
        }               
    }
}
