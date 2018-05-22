/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import domain.Estado;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import lógica.SujetoObservable;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Nicole
 */
public class Logica {
    
    ImageView[][] matrizImageView;
    SujetoObservable sujetoObservable = new SujetoObservable();

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
    
    int estado = 0;

    public void detectaClickMapa(GridPane gridPane) {

        for (int i = 0; i < matrizImageView.length; i++) {
            for (int j = 0; j < matrizImageView[0].length; j++) {
                int auxI = i;
                int auxJ = j;

                matrizImageView[i][j].setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 3) {
                            Image matrizImages[][] = new Image[2][4];
                            try {
                                matrizImages[auxI][auxJ] = new Image(sujetoObservable.notificar(Estado.VACÍA));
                                estado++;
                                matrizImageView[auxI][auxJ].setImage(matrizImages[auxI][auxJ]);
                                Stage stage = new Stage();
                                Parent root = FXMLLoader.load(getClass().getResource("Cliente.fxml"));
                                Scene scene = new Scene(root);
                                stage.setScene(scene);
                                stage.show();
                            } catch (IOException ex) {
                                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParseException ex) {
                                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
                             Image matrizImages[][] = new Image[2][4];
                            try {
                                matrizImages[auxI][auxJ] = new Image(sujetoObservable.notificar(Estado.OCUPADA));
                                System.out.println(sujetoObservable.notificar(Estado.OCUPADA));
                                matrizImageView[auxI][auxJ].setImage(matrizImages[auxI][auxJ]);
                                Stage stage = new Stage();
                                Parent root = FXMLLoader.load(getClass().getResource("Cuenta.fxml"));
                                Scene scene = new Scene(root);
                                stage.setScene(scene);
                                stage.show();
                            } catch (IOException ex) {
                                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParseException ex) {
                                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
            }

        }
    }
}
