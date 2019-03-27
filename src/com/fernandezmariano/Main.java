package com.fernandezmariano;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Pepe", 21, 20000000),
                new Person("Pepito", 22, 35000000),
                new Person("Juan", 17, 400000000),
                new Person("German", 9, 30005000),
                new Person("Fran", 18, 22000000),
                new Person("Leo", 40, 10000000));

        System.out.println(String.format("Mayor de 21 : %s",
                persons
                        .stream()
                        .filter(person -> person.getAge() > 21)
                        .collect(Collectors.toList())));

        System.out.println(String.format("Menor de 18 : %s",
                persons
                        .stream()
                        .filter(person -> person.getAge() < 18)
                        .collect(Collectors.toList())));

        System.out.println(String.format("Mayor de 21 y DNI superior a 20000000: %s",
                persons
                        .stream()
                        .filter(person -> person.getAge() > 21)
                        .filter(person -> person.getDni() > 20000000)
                        .collect(Collectors.toList())));

    }
}
