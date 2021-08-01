package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruck[] trucks = new FoodTruck[5];
		int size = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("1. Add a food truck \n2. Exit to main menu");
			String kb = scanner.nextLine();

			if (kb.equals("1")) {

				System.out.println("Name = ");
				String name = scanner.nextLine();
				if (name.equalsIgnoreCase("quit")) {
					break;
				}
				System.out.println("foodType = ");
				String foodType = scanner.nextLine();

				int rating;
				do {
					System.out.println("rating (1-5) = ");
					rating = scanner.nextInt();
				} while (rating < 1 || rating > 5);
				

				trucks[size++] = new FoodTruck(name, foodType, rating);
				scanner.nextLine();
			} else if (kb.equals("2")) {
				break;
			} else {
				continue;
			}
		}

		while (true) {
			System.out.println("____MAIN MENU______");
			System.out.println("1. List all existing food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the program.");
			String kb = scanner.nextLine();

			if (kb.equals("1")) {
				System.out.println("Displaying all food trucks:");
				for (int i = 0; i < size; i++) {
					System.out.println(trucks[i].toString());
				}
			} else if (kb.equals("2")) {
				int sum = 0;
				for (int i = 0; i < size; i++) {
					sum += trucks[i].getRating();
				}
				float averageRating = (float) (sum / size);
				System.out.println("Average rating for all food trucks is " + averageRating);
			} else if (kb.equals("3")) {
				int maxIndex = -1;
				int highestRating = 0;
				for (int i = 0; i < size; i++) {
					int currentRating = trucks[i].getRating();
					if (currentRating > highestRating) {
						highestRating = currentRating;
						maxIndex = i;
					}
				}

				if (maxIndex != -1) {
					System.out.println("Truck with the greatest rating is: \n" + trucks[maxIndex]);
				} else {
					System.out.println("Can't compute max rating because there are no elements in the truck!");
				}

			} else if (kb.equals("4")) {
				System.out.println("Thank you for your input!");
				break;
			}
		}

	}
}
