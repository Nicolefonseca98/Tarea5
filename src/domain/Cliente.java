
package domain;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class Cliente {
    private String nombre;
    private String teléfono;

    public Cliente(String nombre, String teléfono) {
        this.nombre = nombre;
        this.teléfono = teléfono;
    }

    public Cliente() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the teléfono
     */
    public String getTeléfono() {
        return teléfono;
    }

    /**
     * @param teléfono the teléfono to set
     */
    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tel\u00e9fono=" + teléfono + '}';
    }
    
    
}
