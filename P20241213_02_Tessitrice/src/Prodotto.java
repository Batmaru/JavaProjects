import java.util.HashSet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Prodotto {
    private String tessitrice;
    private String tipoTessuto;
    private int quantita;

    public Prodotto(String tessitrice, String tipoTessuto, int quantita) {
        this.tessitrice = tessitrice;
        this.tipoTessuto = tipoTessuto;
        this.quantita = quantita;
    }

  
    public String getTessitrice() {
        return tessitrice;
    }

    public void setTessitrice(String tessitrice) {
        this.tessitrice = tessitrice;
    }

    public String getTipoTessuto() {
        return tipoTessuto;
    }

    public void setTipoTessuto(String tipoTessuto) {
        this.tipoTessuto = tipoTessuto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

	
	
	public String SerializeJson() {
	    ObjectMapper objectMapper = new ObjectMapper();
	    try {
	        return objectMapper.writeValueAsString(this);
	    } catch (JsonProcessingException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public static Prodotto DeserializeJson(String json) {
	    ObjectMapper objectMapper = new ObjectMapper();
	    try {
	        return objectMapper.readValue(json, Prodotto.class);
	    } catch (JsonMappingException e) {
	        e.printStackTrace();
	    } catch (JsonProcessingException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	}
