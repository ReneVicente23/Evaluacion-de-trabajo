package com.example.backend.DTO;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class PagoEmpleado {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_pagoEmpleado;
    @Column
    private Integer id_Empleado;
    @Column
    private Date fecha;
}
