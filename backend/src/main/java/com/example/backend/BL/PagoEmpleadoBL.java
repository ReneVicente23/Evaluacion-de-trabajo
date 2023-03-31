package com.example.backend.BL;

import com.example.backend.DAO.PagoEmpleadoDAO;
import com.example.backend.DTO.Dish;
import com.example.backend.DTO.PagoEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PagoEmpleadoBL {
    private final PagoEmpleadoDAO pagoEmpleadoDAO;

    public PagoEmpleado nuevoPago(PagoEmpleado pagoEmpleado){
        return  pagoEmpleadoDAO.save(pagoEmpleado);
    }

    public List<PagoEmpleado> obtenerAllPago(){
        return pagoEmpleadoDAO.findAll();
    }
}
