package org.bguerra.api.stream.ejemplos;

import org.bguerra.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Pepe Gonzales",
                        "Marco Gutierrez", "Mario Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(u -> System.out.println(u));


        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
        System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());

        /*if (usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        }else{
        System.out.println("No se encontro el objeto");
        }*/
    }
}