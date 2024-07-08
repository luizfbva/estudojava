package com.example.javastud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javastud.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
