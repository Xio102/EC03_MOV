package com.example.examen03;

public class FoodModel {
    private String foodName;
    private int foodPhoto;


    public FoodModel(String foodName, int foodPhoto) {
        this.foodName = foodName;
        this.foodPhoto = foodPhoto;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPhoto() {
        return foodPhoto;
    }

    public void setFoodPhoto(int foodPhoto) {
        this.foodPhoto = foodPhoto;
    }
}
