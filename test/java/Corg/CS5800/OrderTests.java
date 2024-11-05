package Corg.CS5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTests {

    @Test
    public void testEmptyOrder() {
        Order order = new Order();
        assertEquals(0.0, order.getTotalCost(), "Empty order cost should be 0.0");
    }

    @Test
    public void testOrderWithMultipleItems() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Cheese(new Burger()));
        assertEquals(10.5, order.getTotalCost(), 0.01, "Total cost of two burgers, one with cheese, should be 10.5");
    }
}

