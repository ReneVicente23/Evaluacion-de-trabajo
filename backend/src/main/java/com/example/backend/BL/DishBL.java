package com.example.backend.BL;

import com.example.backend.DAO.DishDAO;
import com.example.backend.DTO.Dish;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DishBL{
    private final DishDAO dishDAO;

    public List<Dish> obtenerAllDish(){
        return dishDAO.findAll();
    }

    public Dish nuevoDish(Dish dish){
        return  dishDAO.save(dish);
    }

}
