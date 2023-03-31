package com.example.backend.DTO;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Pedido {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_ped;
    @Column
    private Integer id_dish;
    @Column
    private Integer id_pedido;
}
