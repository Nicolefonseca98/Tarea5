
package domain;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class Mesa {
    
    private int numeroMesa;
    private String posición;
    private Estado estado;
   
    public Mesa() {
    }

    public Mesa(int numeroMesa, String posición, Estado estado) {
        this.numeroMesa = numeroMesa;
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

    /**
     * @return the numeroMesa
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * @param numeroMesa the numeroMesa to set
     */
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numeroMesa=" + numeroMesa + ", posici\u00f3n=" + posición + ", estado=" + estado + '}';
    }
 
}
