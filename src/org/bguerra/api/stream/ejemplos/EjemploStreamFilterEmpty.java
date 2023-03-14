package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "", "Mario Mena", "")
                .filter(String::isEmpty)
                .peek(System.out::println).count();

        System.out.println("Count: " + count);
    }
}