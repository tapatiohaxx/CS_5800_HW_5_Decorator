package Corg.CS5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingDecoratorTests {

    @Test
    public void testCheeseTopping() {
        FoodItem burger = new Burger();
        FoodItem cheeseBurger = new Cheese(burger);
        assertEquals(5.5, cheeseBurger.getCost(), 0.01, "CheeseBurger price should be 5.5");
    }

    @Test
    public void testBaconTopping() {
        FoodItem burger = new Burger();
        FoodItem baconBurger = new Bacon(burger);
        assertEquals(5.7, baconBurger.getCost(), 0.01, "BaconBurger price should be 5.7");
    }

    @Test
    public void testMultipleToppings() {
        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        burger = new Bacon(burger);
        assertEquals(6.2, burger.getCost(), 0.01, "Burger with cheese and bacon should be 6.2");
    }
}

