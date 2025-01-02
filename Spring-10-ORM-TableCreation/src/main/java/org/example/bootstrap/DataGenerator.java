package org.example.bootstrap;

import org.example.entity.Car;
import org.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;

    @Autowired
    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("BMW", "M5");
        Car c2 = new Car("Honda", "Accord");
        Car c3 = new Car("Mazda", "CX5");

        carRepository.save(c1);


    }
}
