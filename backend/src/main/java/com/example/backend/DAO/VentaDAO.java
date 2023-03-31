package com.example.backend.DAO;

import com.example.backend.DTO.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDAO  extends JpaRepository<Venta,Long> {
}
