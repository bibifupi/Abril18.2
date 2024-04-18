package com.softtek.zOptional;

import java.util.Optional;

//Verifique si un nombre de usuario es válido. Si el nombre de usuario es válido, el
//programa debe imprimir el nombre de usuario. Si el nombre de usuario es nulo o
//vacío, el programa debe imprimir “nombre de usuario inválido”.
public class ej1 {
    public static void main(String[] args) {
        Usuario usuarioConNombre = new Usuario("Juan123");
        Usuario usuarioSinNombre = null; // Usuario sin nombre

        Optional<Usuario> usuarioConNombreOptional = Optional.ofNullable(usuarioConNombre);
        Optional<Usuario> usuarioSinNombreOptional = Optional.ofNullable(usuarioSinNombre);

        verificarNombreUsuario(usuarioConNombreOptional);
        verificarNombreUsuario(usuarioSinNombreOptional);
    }

    private static void verificarNombreUsuario(Optional<Usuario> usuarioOptional) {
        if (usuarioOptional.isPresent()) {
            Usuario usuarioValido = usuarioOptional.get();
            String nombreUsuarioValido = usuarioValido.getNombre();
            System.out.println("Nombre de usuario válido: " + nombreUsuarioValido);
        } else {
            System.out.println("Nombre de usuario inválido");
        }

    }
}
