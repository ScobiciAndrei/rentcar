package scobici.andrei.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scobici.andrei.rentcar.models.Person;
import scobici.andrei.rentcar.service.PersonService;

import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(path = "/add")
    public Person save(Person person) {

        return personService.save(person);
    }

    @GetMapping
    public List<Person> findAll() {

        return personService.findAll();
    }

    @PutMapping("{id}")
    public Person update(@RequestBody Person person, @PathVariable Long id) {

        return personService.update(person,id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        personService.deleteById(id);
    }
}
