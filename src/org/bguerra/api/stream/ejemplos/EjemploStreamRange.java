package org.bguerra.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream numeros = IntStream.range(5, 20).peek(System.out::println);
        //Integer resultado = numeros.reduce(0, Integer::sum);
        //Integer resultado = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Total: " + stats.getCount());
    }
}