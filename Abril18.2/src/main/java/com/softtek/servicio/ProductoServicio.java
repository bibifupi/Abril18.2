package com.softtek.servicio;

import com.softtek.modelo.Producto;
import com.softtek.repo.IProductoRepo;
import com.softtek.repo.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio {
    @Autowired
    private IProductoRepo repo;

    @Override
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException {
        return repo.obtenerTodos();
    }

    @Override
    public Producto obtenerId(int id) throws ClassNotFoundException, SQLException {
        return repo.obtenerId(id);
    }

    @Override
    public void insertarProducto(Producto producto) throws ClassNotFoundException, SQLException {
        repo.insertarProducto(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException {
        repo.actualizarProducto(producto);
    }

    @Override
    public void borrarProducto(int id) throws ClassNotFoundException, SQLException {
        repo.borrarProducto(id);
    }
}
