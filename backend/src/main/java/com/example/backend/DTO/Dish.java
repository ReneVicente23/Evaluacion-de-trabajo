package com.example.backend.DTO;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Entity
@Table
public class Dish {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_dish;
    @Column
    private String name;
    @Column
    private Double cost;
    @Column
    private Double costoElav;

    public Dish(Integer id_dish, String name, Double cost, Double costoElav) {
        this.id_dish = id_dish;
        this.name = name;
        this.cost = cost;
        this.costoElav = costoElav;
    }

    public Dish() {

    }

    public Integer getId_dish() {
        return id_dish;
    }

    public void setId_dish(Integer id_dish) {
        this.id_dish = id_dish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCostoElav() {
        return costoElav;
    }

    public void setCostoElav(Double costoElav) {
        this.costoElav = costoElav;
    }
}
