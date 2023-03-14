package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("Pepe")) {
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(u -> System.out.println(u));

        //nombres.forEach(u -> System.out.println(u));
        System.out.println(nombres.count());
    }
}