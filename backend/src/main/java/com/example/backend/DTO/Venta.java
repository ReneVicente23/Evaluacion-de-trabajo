package com.example.backend.DTO;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Venta {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_Venta;
    @Column
    private Integer id_Empleado;
    @Column
    private Integer id_pedido;
    @Column
    private Date DateSale;
}
