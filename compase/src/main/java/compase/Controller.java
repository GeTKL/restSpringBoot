package compase;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import logic.CardDirect;
import logic.CardDirectModel;
import logic.DegreeRequest;

@RestController
public class Controller {
	private static final CardDirectModel cardDirectModel = CardDirectModel.getInstance();
	
	@PostMapping(value = "/sendSides", consumes = "application/json", produces = "application/json")
	public String sendSides(@RequestBody CardDirect cardDirect) {
		cardDirectModel.setDirect(cardDirect);
		return "Отправлено!";
	}
	
	@GetMapping(value = "/getAll", produces = "application/json")
	public Map<String, CardDirect> getAll(){
		return cardDirectModel.getAll();
	}
	
	@GetMapping(value = "/sendCord", produces = "application/json", consumes = "application/json")
	public Map<String, String> getCord(@RequestBody DegreeRequest request) {
		int degree = request.getDegree();
		//System.out.println("А тут degree = " + degree);
		String side = cardDirectModel.findDirect(degree);
		return Collections.singletonMap("Side", side);
	}
}
