package Corg.CS5800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheeseTest {
    private FoodItem baseItem;
    private FoodItem cheeseDecoratedItem;

    @BeforeEach
    public void setUp() {
        baseItem = new Burger();
        cheeseDecoratedItem = new Cheese(baseItem);
    }

    @Test
    public void testCheeseAddsCostCorrectly() {
        double expectedCost = 5.5;
        assertEquals(expectedCost, cheeseDecoratedItem.getCost(), "Cheese should add 0.5 to the base burger cost.");
    }

    @Test
    public void testCheeseWithMultipleLayers() {
        FoodItem doubleCheeseBurger = new Cheese(cheeseDecoratedItem);  
        double expectedDoubleCheeseCost = 6.0; 
        assertEquals(expectedDoubleCheeseCost, doubleCheeseBurger.getCost(), "Double cheese should add 1.0 to the base burger cost.");
    }

    @Test
    public void testCheeseOnDifferentFoodItem() {
       
        FoodItem hotDog = new HotDog();
        FoodItem cheeseHotDog = new Cheese(hotDog);
        double expectedCheeseHotDogCost = 3.5; 
        assertEquals(expectedCheeseHotDogCost, cheeseHotDog.getCost(), "Cheese should add 0.5 to the base hot dog cost.");
    }
}
