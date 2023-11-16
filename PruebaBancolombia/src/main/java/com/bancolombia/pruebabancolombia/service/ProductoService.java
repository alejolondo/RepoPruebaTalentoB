package com.bancolombia.pruebabancolombia.service;

import com.bancolombia.pruebabancolombia.models.Producto;
import com.bancolombia.pruebabancolombia.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repoProduct;


    public List<Producto> findAll(){
        return repoProduct.findAll();
    }

    public Producto findById(long id){
        return  repoProduct.findById(id).orElse(null);
    }

    public Producto saveProducto(Producto producto){
        return repoProduct.save(producto);
    }

    public void deleteProducto(long id){
        repoProduct.deleteById(id);
    }
}
