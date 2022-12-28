package org.example.controller;


import org.example.domain.Book;
import org.example.domain.Food;
import org.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getFood() {
        return foodService.getFood();
    }

    @GetMapping("/{foodId}")
    public Food getFood(@PathVariable Long foodId) {
        return foodService.getFoodById(foodId);
    }

    @PostMapping
    public boolean postFood(@ModelAttribute Food food) {
        return foodService.addFood(food);
    }

    @DeleteMapping("/{foodId}")
    public boolean deleteOrderedFood(@PathVariable Long foodId) {
        return foodService.deleteOrderedFood(foodId);
    }


    @PutMapping
    public boolean putFood() {
        return true;
    }

    private java.util.List<Food> toList(Food... foods) {
        return java.util.List.of(foods);
    }

    private java.util.List<Food> toList(Food gr1, Food gr2, Food gr3, Food gr4) {
        java.util.List<Food> foods = new ArrayList();
        foods.add(gr1);
        foods.add(gr2);
        foods.add(gr3);
        foods.add(gr4);
        return foods;
    }

}



