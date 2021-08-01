//class FoodTruck {
//
//    public static int id = 0;
//    private String name;
//    private String foodType;
//    private int rating;
//
//    public FoodTruck() {
//        this.id = id++;
//    }
//
//    public FoodTruck(String name, String foodType, int rating) {
//        this.id = id++;
//        setName(name);
//        setFoodType(foodType);
//        setRating(rating);
//    }
//
//    public static int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFoodType() {
//        return foodType;
//    }
//
//    public void setFoodType(String foodType) {
//        this.foodType = foodType;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//
//    @Override
//    public String toString() {
//        return "FoodTruck{" +
//                "id='" + id + '\'' +
//                "name='" + name + '\'' +
//                ", foodType='" + foodType + '\'' +
//                ", rating=" + rating +
//                '}';
//    }
//}
//
//
//
//
//
//import java.util.Scanner;
//
//public class UI {
//
//    public static void main(String[] args) {
//
//        FoodTruck[] trucks = new FoodTruck[5];
//        int size = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i=0; i<5; i++) {
//
//            System.out.println("1. Input add to add a food truck \n2. Input exit to exit the program");
//            String userInput = scanner.nextLine();
//
//            if(userInput.equals("1")) {
//
//                System.out.println("name = ");
//                String name = scanner.nextLine();
//                System.out.println("foodType = ");
//                String foodType = scanner.nextLine();
//
//                int rating;
//                do {
//                    System.out.println("rating = ");
//                    rating = scanner.nextInt();
//                } while (rating < 1 || rating > 5);
//
//                trucks[size++] = new FoodTruck(name, foodType, rating);
//                scanner.nextLine();
//            } else if(userInput.equals("2")) {
//                break;
//            }
//        }
//
//        while(true) {
//            System.out.println("____MAIN MENU______");
//            System.out.println("1. List all existing food trucks.");
//            System.out.println("2. See the average rating of food trucks.");
//            System.out.println("3. Display the highest-rated food truck.");
//            System.out.println("4. Quit the program.");
//            String userInput = scanner.nextLine();
//
//            if(userInput.equals("1")) {
//                System.out.println("Displaying all food trucks:");
//                for(int i=0; i < size; i++) {
//                    System.out.println(trucks[i].toString());
//                }
//            } else if(userInput.equals("2")){
//                int sum = 0;
//                for(int i=0; i<size; i++) {
//                    sum += trucks[i].getRating();
//                }
//                float averageRating = (float) ( sum  / size);
//                System.out.println("Average rating for all food trucks is " + averageRating);
//            } else if(userInput.equals("3")){
//                int maxIndex = -1;
//                int highestRating = 0;
//                for(int i=0; i<size; i++) {
//                    int currentRating = trucks[i].getRating();
//                    if(currentRating > highestRating) {
//                        highestRating = currentRating;
//                        maxIndex = i;
//                    }
//                }
//
//                if(maxIndex != -1){
//                    System.out.println("Truck with the greatest rating is: \n" + trucks[maxIndex]);
//                } else {
//                    System.out.println("Can't comput max rating because there are no elements in the truck!");
//                }
//
//            } else if(userInput.equals("4")) {
//                break;
//            }
//        }
//    }
//}



