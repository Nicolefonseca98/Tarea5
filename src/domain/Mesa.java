
package domain;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class Mesa {
    
    private String posición;
    private Estado estado;
   
    public Mesa() {
    }

    public Mesa(String posición, Estado estado) {
        this.posición = posición;
        this.estado = estado;
    }

    /**
     * @return the posición
     */
    public String getPosición() {
        return posición;
    }

    /**
     * @param posición the posición to set
     */
    public void setPosición(String posición) {
        this.posición = posición;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
