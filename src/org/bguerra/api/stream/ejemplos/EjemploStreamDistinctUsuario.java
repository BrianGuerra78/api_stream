package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia","Pato Guzman","Pato Guzman")
                .distinct()
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));

        nombres.forEach(System.out::println);
    }
}