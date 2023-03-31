package com.example.backend.BL;

import com.example.backend.DAO.EmpleadoDAO;
import com.example.backend.DTO.Dish;
import com.example.backend.DTO.Empleado;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpeladoBL {

    private final EmpleadoDAO empleadoDAO;

    public Empleado nuevoEmpleado(Empleado empleado){
        return empleadoDAO.save(empleado);
    }
}
