package org.bguerra.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(5, 10, 15, 20);

        //Integer resultado = numeros.reduce(0, (a, b) -> a + b);
        //Integer resultado = numeros.reduce(0, (a, b) -> Integer.sum(a, b));
        Integer resultado = numeros.reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}