package com.example.javastud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javastud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
