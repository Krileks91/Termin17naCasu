package com.example.termin17nacasu;

import java.util.List;

public class Jelo {
    private String food;
    private float rating;
    private int id;
    private String Description;
    private List<String> Ingridients;
    private int calories;
    private double price;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<String> getIngridients() {
        return Ingridients;
    }

    public void setIngridients(List<String> ingridients) {
        Ingridients = ingridients;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Jelo(String food, float rating, int id, String description, List<String> ingridients, int calories, double price) {
        this.food = food;
        this.rating = rating;
        this.id = id;
        Description = description;
        Ingridients = ingridients;
        this.calories = calories;
        this.price = price;
    }
}
