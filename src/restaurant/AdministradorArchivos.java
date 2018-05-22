
package restaurant;

import domain.Estado;
import domain.Mesa;
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
            mesa.setEstado((Estado) jsonObject.get("estado"));
            mesa.setPosición(jsonObject.get("posicion").toString());
            listaMesas.add(mesa);
        }
        return listaMesas;
    }
  
 }
