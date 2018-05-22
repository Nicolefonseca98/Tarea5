
package domain;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class Producto {
    
    private String nombre;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
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
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
