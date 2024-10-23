package scobici.andrei.rentcar.service;

import org.springframework.stereotype.Service;
import scobici.andrei.rentcar.models.Person;
import scobici.andrei.rentcar.repository.PersonRepository;

import java.util.List;
import java.util.Optional;
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {

        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person update(Person person, Long id) {
        Optional<Person> existingPerson = personRepository.findById(id);

        if (existingPerson.isPresent()) {
            return personRepository.save(person);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
