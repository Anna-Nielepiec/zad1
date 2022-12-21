package org.example.repository.Food;

import org.example.domain.Food;

import java.util.List;

public interface CustomerFoodRepo {


    List<Food> getFood();

    Food getFoodById(Long foodId);

    boolean orderFood(Food food);

    boolean deleteOrderedFood(Long foodId);

    boolean payForFood(Food food);
}
