package com.emergentes.dao;

import com.emergentes.modelo.Producto;
import java.util.List;

public interface ProductoDAO {
    public void insert(Producto producto) throws Exception;//para insertar
    public void update(Producto producto) throws Exception;//para actualizar
    public void delete(int id) throws Exception;//para borrar
    public Producto getById(int id) throws Exception;//para obtener id
    public List<Producto> getAll() throws Exception;
}
