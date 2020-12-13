package com.example.MobifyController;

import com.example.Model.Person;
import com.example.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class MobifyController {
	@Autowired
	private PersonRepository personrepository;

	@PostMapping("/create")
	public void createperson(@RequestBody Person person) {
		personrepository.save(person);
	}

	@GetMapping("/persons")
	public List<Person> retrieveAllUsers() {
		return (List<Person>) personrepository.findAll();
	}


	//this function for find the person with particular id;
	@GetMapping("/person/{id}")
	public Optional<Person> retreiveoneuser(@PathVariable int id){
		//return Optional<Person> userOptional = personrepository.findById(id);
		return personrepository.findById(id);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		personrepository.deleteById(id);
	}
}
