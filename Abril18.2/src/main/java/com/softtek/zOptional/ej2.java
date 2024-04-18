package com.softtek.zOptional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//obtenga un valor de una lista, dada una posición. Si la lista está vacía o la posición
//no es válida, el programa debe imprimir un valor predeterminado.
public class ej2 {
    public static void main(String[] args) {
        // Crear tres listas
        List<String> nombresConValores = Arrays.asList("Juan", "María", "Pedro");
        List<String> nombresVacios = Collections.emptyList();
        List<String> nombresConPosicionInvalida = Arrays.asList("Juan", "María", "Pedro");

        // Posición válida
        int posicionValida = 1;

        // Obtener el valor en la posición válida de la lista con valores
        Optional<String> nombreOptional = Optional.ofNullable(nombresConValores.get(posicionValida));
        if (nombreOptional.isPresent()) {
            System.out.println("Nombre en la posición " + posicionValida + " (lista con valores): " + nombreOptional.get());
        } else {
            System.out.println("No hay nombre en la posición " + posicionValida + " (lista con valores)");
        }

        // Intentar obtener un valor de la lista vacía
        if (!nombresVacios.isEmpty()) {
            nombreOptional = Optional.ofNullable(nombresVacios.get(0));
            if (nombreOptional.isPresent()) {
                System.out.println("Nombre en la posición 0 (lista vacía): " + nombreOptional.get());
            } else {
                System.out.println("La lista vacía no contiene elementos");
            }
        } else {
            System.out.println("La lista nombresVacios está vacía. No se puede acceder a elementos.");
        }

        // Posición inválida en la lista con valores
        int posicionInvalida = 10; // Invalid index

        // Validar la posición inválida antes de acceder al elemento
        if (posicionInvalida >= 0 && posicionInvalida < nombresConPosicionInvalida.size()) {
            nombreOptional = Optional.ofNullable(nombresConPosicionInvalida.get(posicionInvalida));
            if (nombreOptional.isPresent()) {
                System.out.println("Nombre en la posición " + posicionInvalida + " (lista con valores): " + nombreOptional.get());
            } else {
                System.out.println("No hay nombre en la posición " + posicionInvalida + " (lista con valores)");
            }
        } else {
            System.out.println("La posición " + posicionInvalida + " es inválida para la lista con valores.");
        }
    }
}
