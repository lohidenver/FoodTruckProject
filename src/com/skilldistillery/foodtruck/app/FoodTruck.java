package com.skilldistillery.foodtruck.app;

class FoodTruck {

    public static int id = 0;
    private String name;
    private String foodType;
    private int rating;

    public FoodTruck() {
        id++;
    }

    public FoodTruck(String name, String foodType, int rating) {
        this.id = id++;
        setName(name);
        setFoodType(foodType);
        setRating(rating);
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "FoodTruck{" +
                "name='" + name + '\'' +
                ", foodType='" + foodType + '\'' +
                ", rating=" + rating +
                '}';
    }
}