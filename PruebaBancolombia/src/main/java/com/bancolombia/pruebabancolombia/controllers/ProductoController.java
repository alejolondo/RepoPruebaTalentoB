package com.bancolombia.pruebabancolombia.controllers;

import com.bancolombia.pruebabancolombia.models.Producto;
import com.bancolombia.pruebabancolombia.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> findAllProductos() {
        List<Producto> productos = productoService.findAll();
        if (!productos.isEmpty()) {
            return new ResponseEntity<>(productos, HttpStatus.OK);
        }
        return new ResponseEntity<>(productos, HttpStatus.NO_CONTENT);
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> findProductoById(@PathVariable("id") long id){
        Producto producto = productoService.findById(id);
        return new  ResponseEntity<>(producto, HttpStatus.OK);

    }

}
