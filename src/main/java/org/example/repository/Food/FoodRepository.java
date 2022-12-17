package org.example.repository.Food;

import org.example.domain.Food;

import java.util.List;

public class FoodRepository implements CustomerFoodRepo,EmployeeFoodRepo{
    @Override
    public List<Food> getFood() {
        return null;
    }

    @Override
    public Food getFoodById(Long foodId) {
        return null;
    }

    @Override
    public boolean orderFood(Food food) {
        return false;
    }

    @Override
    public boolean deleteOrderFood(Long foodId) {
        Food foodToDelete = getFoodById(foodId);
        return getFood().remove(foodToDelete);
    }

    @Override
    public boolean addFood(Long foodId) {
        return false;
    }

    @Override
    public boolean payForFood(Food food) {
        return false;
    }
}
