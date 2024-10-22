package scobici.andrei.rentcar.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import scobici.andrei.rentcar.models.Car;
import scobici.andrei.rentcar.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car create(Car car) {

        return carRepository.save(car);
    }

    public List<Car> findAll() {

        return carRepository.findAll();
    }

    public Car update(Car car, Long id) {
        Optional<Car> carsExisting = carRepository.findById(id);
        if (carsExisting.isPresent()) {
            return carRepository.save(car);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }
}
