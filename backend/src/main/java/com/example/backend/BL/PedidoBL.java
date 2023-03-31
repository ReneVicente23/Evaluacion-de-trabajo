package com.example.backend.BL;

import com.example.backend.DAO.PedidoDAO;
import com.example.backend.DTO.Dish;
import com.example.backend.DTO.Pedido;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoBL {
    private final PedidoDAO pedidoDAO;

    public Pedido nuevoPedido(Pedido pedido){
        return  pedidoDAO.save(pedido);
    }

    public List<Pedido> obtenerAllPedidos(){
        return pedidoDAO.findAll();
    }
}
