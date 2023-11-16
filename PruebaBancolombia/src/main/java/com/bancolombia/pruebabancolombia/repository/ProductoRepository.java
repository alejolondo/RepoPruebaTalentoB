package com.bancolombia.pruebabancolombia.repository;

import com.bancolombia.pruebabancolombia.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
