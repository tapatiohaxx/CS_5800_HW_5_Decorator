package Corg.CS5800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheeseTest {
    private FoodItem baseItem;
    private FoodItem cheeseDecoratedItem;

    @BeforeEach
    public void setUp() {
        // Initialize a base food item, for simplicity, we'll use Burger which has a fixed cost.
        baseItem = new Burger();
        // Decorate the burger with cheese
        cheeseDecoratedItem = new Cheese(baseItem);
    }

    @Test
    public void testCheeseAddsCostCorrectly() {
        // The base cost of a Burger is 5.0, and Cheese adds 0.5
        double expectedCost = 5.5;
        assertEquals(expectedCost, cheeseDecoratedItem.getCost(), "Cheese should add 0.5 to the base burger cost.");
    }

    @Test
    public void testCheeseWithMultipleLayers() {
        // Adding multiple layers of cheese to see if the cost accumulates correctly
        FoodItem doubleCheeseBurger = new Cheese(cheeseDecoratedItem);  // Double cheese burger
        double expectedDoubleCheeseCost = 6.0; // Base 5.0 + Cheese 0.5 + Additional Cheese 0.5
        assertEquals(expectedDoubleCheeseCost, doubleCheeseBurger.getCost(), "Double cheese should add 1.0 to the base burger cost.");
    }

    @Test
    public void testCheeseOnDifferentFoodItem() {
        // Testing Cheese on a different food item, let's say HotDog
        FoodItem hotDog = new HotDog();
        FoodItem cheeseHotDog = new Cheese(hotDog);
        double expectedCheeseHotDogCost = 3.5; // Base HotDog 3.0 + Cheese 0.5
        assertEquals(expectedCheeseHotDogCost, cheeseHotDog.getCost(), "Cheese should add 0.5 to the base hot dog cost.");
    }
}
