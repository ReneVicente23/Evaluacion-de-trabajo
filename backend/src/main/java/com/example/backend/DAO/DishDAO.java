package com.example.backend.DAO;

import com.example.backend.DTO.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishDAO extends JpaRepository<Dish,Long> {
}
