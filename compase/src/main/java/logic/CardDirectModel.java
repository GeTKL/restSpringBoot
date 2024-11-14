package logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CardDirectModel implements Serializable {
	public static final CardDirectModel instance = new CardDirectModel();
	
	private final Map<String, CardDirect> cardDirectRange;
	
	public CardDirectModel() {
		cardDirectRange = new HashMap<String, CardDirect>();
	}
	
	public static CardDirectModel getInstance() {
		return instance;
	}
	
	public void setDirect(CardDirect cardDirect) {
		cardDirectRange.put("Degree", cardDirect);
	}
	
	public Map<String, CardDirect> getAll() {
		return cardDirectRange;
	}	
	
	public String findDirect(int degree) {
		CardDirect cardDirect = cardDirectRange.get("Degree");
		
		Map<String, String> sides = new HashMap<>();
		sides.put("north", cardDirect.getNorth());
		sides.put("east", cardDirect.getEast());
		sides.put("south", cardDirect.getSouth());
		sides.put("west", cardDirect.getWest());
		sides.put("northEast", cardDirect.getNorthEast());
		sides.put("northWest", cardDirect.getNorthWest());
		sides.put("southEast", cardDirect.getSouthEast());
		sides.put("southWest", cardDirect.getSouthWest());
		
		for (Map.Entry<String, String> entry: sides.entrySet()) {
			String[] border = entry.getValue().split("-");
			int min = Integer.parseInt(border[0]);
			int max = Integer.parseInt(border[1]);
			if (degree >= min && degree <= max) {
				return entry.getKey();
			}
		}
		
		return "Ошибка_диапазона";
	}
}
