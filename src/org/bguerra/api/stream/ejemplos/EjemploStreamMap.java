package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        System.out.println("======Forma 1 ======");
        Stream<String> nombres = Stream.of("Pato", "Pepe", "Marco", "Mario").map(nombre -> {
            return nombre.toUpperCase();
        });
        //nombres.forEach(e -> System.out.println(e));
        nombres.forEach(System.out::println);
        System.out.println("======Forma 2 ======");
        Stream.of("Pato", "Pepe", "Marco", "Mario").map(nombre2 -> {
            return nombre2.toUpperCase();
        }).forEach(System.out::println);

        System.out.println("======Forma 3 ======");
        Stream<String> nombres3 = Stream.of("Pato", "Pepe", "Marco", "Mario")
                .peek(System.out::println)
                .map(String::toUpperCase);

        nombres3.forEach(System.out::println);

        System.out.println("======Forma 4 ======");
        Stream<String> nombres4 = Stream.of("Pato", "Pepe", "Marco", "Mario")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        //.peek(System.out::println);
        List<String> lista = nombres4.collect(Collectors.toList());
        lista.forEach(System.out::println);

        System.out.println("======Forma 5 ======");
        Stream<Usuario> nombres5 = Stream.of("Pato Guzman", "Pepe Gonzales", "Marco Gutierrez", "Mario Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        //.peek(System.out::println);
        List<Usuario> lista2 = nombres5.collect(Collectors.toList());
        lista2.forEach(u -> System.out.println(u));
    }
}