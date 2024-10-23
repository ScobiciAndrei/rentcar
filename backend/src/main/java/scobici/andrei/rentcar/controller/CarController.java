package scobici.andrei.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scobici.andrei.rentcar.models.Car;
import scobici.andrei.rentcar.service.CarService;

import java.util.List;

@Controller
@RequestMapping(path = "api/v1/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(path = "/add")
    public Car create(@RequestBody Car car) {

        return carService.create(car);
    }

    @GetMapping
    public List<Car> findAll() {

        return carService.findAll();
    }

    @PutMapping("{id}")
    public Car update(@RequestBody Car car, @PathVariable Long id) {

        return carService.update(car, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        carService.deleteById(id);
    }
}
