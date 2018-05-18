/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author Nicole
 */
public class Orden {
    
    private ArrayList listaProductos;
    private ArrayList listaPrecios;

    public Orden() {
    }

    public Orden(ArrayList listaProductos, ArrayList listaPrecios) {
        this.listaProductos = listaProductos;
        this.listaPrecios = listaPrecios;
    }

    /**
     * @return the listaProductos
     */
    public ArrayList getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * @return the listaPrecios
     */
    public ArrayList getListaPrecios() {
        return listaPrecios;
    }

    /**
     * @param listaPrecios the listaPrecios to set
     */
    public void setListaPrecios(ArrayList listaPrecios) {
        this.listaPrecios = listaPrecios;
    }
    
    
    
}
