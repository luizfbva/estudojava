package com.example.javastud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javastud.entities.OrderItem;
import com.example.javastud.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
