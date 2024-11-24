package org.example.bootstrap;

import com.github.javafaker.Faker;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataGenerator {

    public static List<Student> createStudents(int numberOfStudents) {
        Faker faker = new Faker();
        return IntStream.range(0, numberOfStudents)
                .mapToObj(i -> new Student(
                        faker.name().firstName(),
                        faker.name().lastName(),
                        faker.number().numberBetween(18, 65),
                        3.0
                ))
                .collect(Collectors.toList());
    }
}