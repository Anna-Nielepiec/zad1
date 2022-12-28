package org.example.repository.Food;

import org.example.domain.Food;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FoodRepository implements CustomerFoodRepo,EmployeeFoodRepo{
    @Override
    @Cacheable ("food")
    public List<Food> getFood() {
        Food meal1 = new Food("pizza",30,1,"szynka,ser,pieczarki" );
        Food meal2 = new Food("Hamburger",20,2,"mięso,sos,sałata,bułka,ser");
        Food meal3 = new Food("lasagne",30,3,"makaron, mieso mielone, sos, ser");
        Food meal4 = new Food("salatka cezar", 25,4,"kurczak, salata rzymska,oliwa z oliwek,parmezan,grzanki");

        return Stream.of(meal1,meal2,meal3,meal4)
                .collect(Collectors.toList());
    }

    @Override
    public Food getFoodById(Long foodId) {
        return getFood()
                .stream()
                .filter(food -> food.getId() == foodId).findFirst().get();
    }

    @Override
    public boolean orderFood(Food food) {
        List <Food> foodToOrder = getFood();
        return foodToOrder.add(food);       //nie wiem czy tu jest ok
    }

    @Override
    public boolean deleteOrderedFood(Long foodId) {
        Food foodToDelete = getFoodById(foodId);
        return getFood().remove(foodToDelete);
    }

    @Override
    public boolean addFood(Food food) {
        List<Food> foodTmp = getFood();
        return foodTmp.add(food);
    }

    @Override
    public boolean payForFood(Food food) {
        Food foodToPay =
        return ;                           //nie wiem jak to zrobic
    }
}
