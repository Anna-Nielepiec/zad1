package org.example.service;

import org.example.domain.Food;
import org.example.repository.Food.CustomerFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FoodService {

    @Autowired
    private CustomerFoodRepo foodRepository;

    public List<Food> getFood() {
        return foodRepository.getFood();
    }

    public Food getFoodById(Long foodId) {
        return getFood()
                .stream()
                .filter(food -> food.getId() == foodId).findFirst().get();
    }

    public boolean orderFood(Food food){
        return foodRepository.getFood().add(food);
    }

    public boolean deleteOrderedFood( Long foodId){
        Food foodToDelete = getFoodById(foodId);
        return foodRepository.getFood().remove(foodToDelete);
    }

    public boolean addFood(Food food) {
        return foodRepository.getFood().add(food);
    }

    public boolean payForFood(Food food) {
        return foodRepository.
    }
}
