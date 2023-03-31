package com.example.backend.BL;

import com.example.backend.DAO.VentaDAO;
import com.example.backend.DTO.Venta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VentaBL {
    private final VentaDAO ventaDAO;

    public Venta nuevaVenta(Venta venta){
        return  ventaDAO.save(venta);
    }
}
