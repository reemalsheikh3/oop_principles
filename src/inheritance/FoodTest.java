package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

        Vegetable vegetable1 = new Vegetable();
        vegetable1.taste = "good";
        vegetable1.name = "parsley";
        vegetable1.isSpicy = false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";

        System.out.println(vegetable2);

        ArrayList<Food> allFoods = new ArrayList<>();
        allFoods.add(food1);
        allFoods.add(vegetable1);
        allFoods.add(vegetable2);

        System.out.println("----Count task enhances for loop solution----");
        int count = 0;
        for (Food foods : allFoods) {
            if (foods.name.length() > 5) count++;
        }
        System.out.println(count);

        System.out.println("----Count task BONUS solution----");
        System.out.println(allFoods.stream().filter(food -> food.name.length() > 5).count());
    }

}
