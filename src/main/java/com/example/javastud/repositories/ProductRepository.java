package com.example.javastud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javastud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
