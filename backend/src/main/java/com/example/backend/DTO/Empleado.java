package com.example.backend.DTO;

import javax.persistence.*;

@Entity
@Table
public class Empleado {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_Empleado;
    @Column
    private String name;
    @Column
    private Double salario;
    @Column
    private Integer cargo;

    public Empleado(Integer id_Empleado, String name, Double salario, Integer cargo) {
        this.id_Empleado = id_Empleado;
        this.name = name;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Empleado() {

    }

    public Integer getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(Integer id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}
