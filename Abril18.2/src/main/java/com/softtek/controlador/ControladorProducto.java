package com.softtek.controlador;

import com.softtek.modelo.Producto;
import com.softtek.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControladorProducto {

    @Autowired
    private IProductoServicio servicio;

    @GetMapping
    public List<Producto> obtenerTodos() throws SQLException, ClassNotFoundException {

        return servicio.obtenerTodos();
    }
    @GetMapping("/{id}")
    public Producto obtenerId(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return servicio.obtenerId(id);
    }
    @PostMapping
    public void insertarProducto(@RequestBody Producto producto) throws SQLException, ClassNotFoundException {
        servicio.insertarProducto(producto);
    }
    @PutMapping
    public void actualizarProducto(@RequestBody Producto productos) throws SQLException, ClassNotFoundException {
        servicio.actualizarProducto(productos);
    }
    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException {
        servicio.borrarProducto(id);
    }



}
