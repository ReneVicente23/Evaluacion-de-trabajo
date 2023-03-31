package com.example.backend.DAO;

import com.example.backend.DTO.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDAO  extends JpaRepository<Pedido,Long> {
}
