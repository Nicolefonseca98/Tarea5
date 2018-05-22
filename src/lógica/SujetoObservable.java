
package lógica;

import domain.Estado;
import domain.Mesa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class SujetoObservable {
    
    public ArrayList<Mesa> mesas = new ArrayList<>();
    AdministradorArchivos administradorArchivos = new AdministradorArchivos();
    
    public String notificar(Estado estado) throws IOException, FileNotFoundException, ParseException {
        mesas = administradorArchivos.leerArchivoMesa();
        String url = "";
        for (Mesa mesa : mesas) {
            switch (mesa.getEstado()) {           
                case VACÍA:
                    url = "/images/Reservada.png";
                    //Cambiar a reservada, datos del cliente
                    break;
                case RESERVADA:
                    url = "/images/Libre.png";
                    //Cancelar la reservación
                    break;
                case OCUPADA:
                    url = "/images/Ocupada.png";
                    //Si está ocupada agregar platillos
                    break;
            }
        }
        return url;
    }
    
}
