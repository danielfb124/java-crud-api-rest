package com.api_rest.api_rest_java_springboot.Modelo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_rest.api_rest_java_springboot.Modelo.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
