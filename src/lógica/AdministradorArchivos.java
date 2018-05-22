
package lógica;

import domain.Estado;
import domain.Mesa;
import domain.Producto;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Nicole Fonseca, Wilmer Mata
 */
public class AdministradorArchivos {
    
    public ArrayList leerArchivoMesa() throws FileNotFoundException, IOException, ParseException {
        JSONParser JsonParser = new JSONParser();
        Object object = JsonParser.parse(new FileReader("Mesas.json"));
        JSONArray jsonArray = (JSONArray) object;
        ArrayList<Mesa> listaMesas = new ArrayList<>(); 
        for (int i = 0; i < jsonArray.size(); i++) {
            Mesa mesa = new Mesa();
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            mesa.setEstado(Estado.valueOf(jsonObject.get("Estado").toString()));
            mesa.setNumeroMesa(Integer.valueOf((jsonObject.get("Numero").toString())));
            mesa.setPosición(jsonObject.get("Posicion").toString());
            listaMesas.add(mesa);
        }
        System.out.println(listaMesas.toString());
        return listaMesas;
    }
  
    public ArrayList leerArchivoMenu() throws FileNotFoundException, IOException, ParseException {
        JSONParser JsonParser = new JSONParser();
        Object object = JsonParser.parse(new FileReader("Menu.json"));
        JSONArray jsonArray = (JSONArray) object;
        ArrayList<Producto> listaProductos = new ArrayList<>(); 
        for (int i = 0; i < jsonArray.size(); i++) {
            Producto producto = new Producto();
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            producto.setNombre(jsonObject.get("Name").toString());
            producto.setPrecio(Integer.valueOf(jsonObject.get("Price").toString()));
            listaProductos.add(producto);
        }
        System.out.println(listaProductos.toString());
        return listaProductos;
    }
    
 }
