package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
