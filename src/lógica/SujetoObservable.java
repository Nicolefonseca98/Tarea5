
package lógica;

import domain.Estado;
import domain.Mesa;
import java.util.ArrayList;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class SujetoObservable {
    
    public ArrayList<Mesa> mesas = new ArrayList<>();
    
    public void notificar(Estado estado) {
        for (Mesa mesa : mesas) {
            switch (mesa.getEstado()) {           
                case VACÍA:
                    //Cambiar a reservada, datos del cliente
                    break;
                case RESERVADA:
                    //Cancelar la reservación
                    break;
                default:
                    //Si está ocupada agregar platillos
                    break;
            }
        }
    }
    
}
