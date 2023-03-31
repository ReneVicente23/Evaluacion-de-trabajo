package com.example.backend.DAO;

import com.example.backend.DTO.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDAO  extends JpaRepository<Empleado,Long> {
}
