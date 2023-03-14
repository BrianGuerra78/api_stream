package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia", "Pato Guzman"
                        , "Pato Guzman", "Pato Guzman")
                .distinct()
                .forEach(System.out::println);
        System.out.println("========================");
        Stream<String> nombres = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia", "Pato Guzman"
                        , "Pato Guzman", "Pato Guzman")
                .distinct();
        nombres.forEach(System.out::println);

    }
}