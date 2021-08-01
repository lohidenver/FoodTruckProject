package com.skilldistillery.foodtruck.app;

class FoodTruck {

    private static int id = 0;
    private String name;
    private String foodType;
    private int rating;
    private int truckID = 0;

    public FoodTruck(String name, String foodType, int rating) {
        this.truckID = ++id;
        setName(name);
        setFoodType(foodType);
        setRating(rating);
    }

    public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public static void setId(int id) {
		FoodTruck.id = id;
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
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", truckID=" + truckID
				+ "]";
	}
}