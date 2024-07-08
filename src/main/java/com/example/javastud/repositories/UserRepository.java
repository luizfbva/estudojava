package com.example.javastud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javastud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
