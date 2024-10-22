package scobici.andrei.rentcar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import scobici.andrei.rentcar.enums.CarTransmision;
import scobici.andrei.rentcar.enums.TypeOfCar;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private CarTransmision carTransmision;
    private TypeOfCar typeOfCar;
    private LocalDate dateOfRelease;
    private int doorsNumber;
    private int numberOfPassagers;
    private boolean hasDriverLicense;
    private boolean hasAC;
}
