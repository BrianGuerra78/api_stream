package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres5 = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(u -> System.out.println(u));

        //.peek(System.out::println);
        List<Usuario> lista2 = nombres5.collect(Collectors.toList());
        lista2.forEach(u -> System.out.println(u));
    }
}