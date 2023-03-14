package org.bguerra.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia", "Pato Guzman"
                        , "Pato Guzman", "Pato Guzman")
                .distinct();
        String resultado = nombres.reduce("Resultado concatenacion", (a, b) -> a + "# " + b);
        System.out.println(resultado);
    }
}