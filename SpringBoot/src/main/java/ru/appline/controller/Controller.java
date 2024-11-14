package ru.appline.controller;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.appline.logic.Pet;
import ru.appline.logic.PetModel;

@RestController
public class Controller {
	private static final PetModel petModel = PetModel.getInstance();
	private static final AtomicInteger newId = new AtomicInteger(1);
	
	@PostMapping(value = "/createPet", consumes = "application/json", produces = "application/json")
	public String createPet(@RequestBody Pet pet) {
		int id = newId.getAndIncrement();
		pet.setId(id);
		petModel.add(pet, id);
		if (newId.get() == 2)
		{

			return "Вы_добавили_первое_животное!";
		}
		else {
			return "Вы_добавили_животное!";
		}
	}
	
	@GetMapping(value = "/getAll", produces = "application/json")
	public Map<Integer, Pet> getAll(){
		return petModel.getAll();
	}
	
	@GetMapping(value = "/getPet", consumes = "application/json", produces = "application/json")
	public Pet getPet(@RequestBody Map<String, Integer> id) {
		return petModel.getFromList(id.get("id"));
	}
	
	@DeleteMapping(value = "/deletePet", consumes = "application/json", produces = "application/json")
	public String deletePet(@RequestBody Map<String, Integer> id) {
		petModel.removeFromList(id.get("id"));
		return "Питомец_удален_успешно";
	}
	
	@PutMapping(value = "/putPet", consumes = "application/json", produces = "application/json")
	public String putPet(@RequestBody Pet pet) {
		int id = pet.getId();
		petModel.add(pet, id);
		return "Питомец_успешно_обновлен";
	}
}
