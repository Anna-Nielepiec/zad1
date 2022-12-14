package org.example.repository.Food;

import org.example.domain.Food;

import java.util.List;

public interface EmployeeFoodRepo {


    List<Food> getFood();

    Food getFoodById(Long foodId);

    boolean orderFood(Food food);

    boolean deleteOrderedFood(Long foodId);

    boolean addFood(Food food);
}
