package com.example.backend.API;

import com.example.backend.BL.DishBL;
import com.example.backend.DTO.Dish;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/dish")
public class DishAPI {
    private DishBL dishBl;

    public DishAPI(DishBL dishBl) {
        this.dishBl = dishBl;
    }

    @GetMapping(path="/todos", produces = APPLICATION_JSON_VALUE)
    public List<Dish> findaddressapi() {
       return dishBl.obtenerAllDish();
    }

    @PostMapping(path="/nuevo", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE )
    public Dish insertaddress(@RequestBody Dish dish) {
       dishBl.nuevoDish(dish);
        return dish;
    }
}
