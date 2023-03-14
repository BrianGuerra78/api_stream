package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(3));

        System.out.println(existe);
        List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Guzman")
                , new Usuario("Pepe", "Gonzales")
                , new Usuario("Marco", "Gutierrez")
                , new Usuario("Mario", "Mena")
                , new Usuario("Pepe", "Garcia"));

        boolean resultado = false;
        for (Usuario u : lista) {
            if (u.getId().equals(3)) {
                resultado = true;
                break;
            }
        }
        System.out.println(resultado);
    }
}