package com.softtek.repo;

import com.softtek.modelo.Producto;

import java.sql.SQLException;
import java.util.List;

public interface IProductoRepo {
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException;
    public Producto obtenerId(int id) throws ClassNotFoundException, SQLException;
    Producto insertarProducto(Producto producto) throws ClassNotFoundException, SQLException;
    Producto actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException;
    public void borrarProducto(int id) throws ClassNotFoundException, SQLException;

}