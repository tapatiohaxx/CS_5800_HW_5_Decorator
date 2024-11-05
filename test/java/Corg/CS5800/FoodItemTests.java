package Corg.CS5800;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTests {

    @Test
    public void testBurgerCost() {
        Burger burger = new Burger();
        assertEquals(5.0, burger.getCost(), "Burger price should be 5.0");
    }

    @Test
    public void testFriesCost() {
        Fries fries = new Fries();
        assertEquals(2.0, fries.getCost(), "Fries price should be 2.0");
    }

    @Test
    public void testHotDogCost() {
        HotDog hotDog = new HotDog();
        assertEquals(3.0, hotDog.getCost(), "HotDog price should be 3.0");
    }
}