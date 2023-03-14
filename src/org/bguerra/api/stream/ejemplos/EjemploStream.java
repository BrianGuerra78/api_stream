package org.bguerra.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        System.out.println("======Forma 1 ======");
        Stream<String> nombres = Stream.of("Pato", "Pepe", "Marco", "Mario");
        //nombres.forEach(e -> System.out.println(e));
        nombres.forEach(System.out::println);

        System.out.println("=====Forma 2===");
        String[] arr = {"Pato", "Pepe", "Marco", "Mario"};
        //Stream<String> nombres2 = Arrays.stream(arr);
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        System.out.println("=====Forma 3====");
        Stream<String> nombres2 = Stream.<String>builder().add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        nombres2.forEach(System.out::println);

        System.out.println("=====Forma 4=======");

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepe");

        //Stream<String> nombres3 = lista.stream();
        //nombres3.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}