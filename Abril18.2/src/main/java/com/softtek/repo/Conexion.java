
package com.softtek.repo;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Repository
public class Conexion {
    //Atributos
    protected Connection miConexion;

    //Métodos
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver"); //registra el driver en nuestra aplicacion para cuando hacemos aplicaciones web
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/northwind",
                "postgres", "postgres");
        System.out.println("Éxito al abrir la conexión");
    }

    //Constructores
    public Conexion() {

    }
    //Getters y Setters

    public Connection getMiConexion() {
        return miConexion;
    }

    public void setMiConexion(Connection miConexion) {
        this.miConexion = miConexion;
    }
}
