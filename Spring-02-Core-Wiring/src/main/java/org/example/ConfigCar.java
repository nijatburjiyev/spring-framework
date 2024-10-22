package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    public Car car() {
        Car car = new Car();
        car.setMake("Honda");
        return car;
    }


    // Manual Wiring
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Mike");
        person.setCar(new Car());
        return person;
    }

    // Auto Wiring
    @Bean
    public Person person(Car car) {
        Person person = new Person();
        person.setName("Mike");
        person.setCar(car);
        return person;
    }
}
