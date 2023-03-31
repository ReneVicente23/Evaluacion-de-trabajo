package com.example.backend.DAO;

import com.example.backend.DTO.PagoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoEmpleadoDAO extends JpaRepository<PagoEmpleado,Long> {
}
