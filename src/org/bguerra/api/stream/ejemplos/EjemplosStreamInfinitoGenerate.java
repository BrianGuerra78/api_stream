package org.bguerra.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemplosStreamInfinitoGenerate {
    public static void main(String[] args) {
        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return contador.incrementAndGet();
                })
                .limit(7)
                .forEach(System.out::println);
    }
}