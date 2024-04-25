package com.softtek.servicio;

import com.softtek.modelo.Producto;

import java.sql.SQLException;
import java.util.List;

public interface IProductoServicio {
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException;

    public Producto obtenerId(int id) throws ClassNotFoundException, SQLException;

    public void insertarProducto(Producto producto) throws ClassNotFoundException, SQLException;

    public void actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException;

    public void borrarProducto(int id) throws ClassNotFoundException, SQLException;
}