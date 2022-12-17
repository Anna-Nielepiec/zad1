package org.example.domain;

public class Food {

    private String name;
    private int price;
    private int id;
    private String ingredients;

    public Food(){
    }

    public Food(String name, int price, int id, String ingredients) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
