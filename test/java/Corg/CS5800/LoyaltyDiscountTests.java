package Corg.CS5800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyDiscountTests {

    @Test
    public void testApplyDiscount() {
        LoyaltyDiscount discount = new LoyaltyDiscount(10);  
        double result = discount.applyDiscount(100);
        assertEquals(90.0, result, 0.01, "10% discount on 100 should be 90.0");
    }

    @Test
    public void testNoDiscount() {
        LoyaltyDiscount discount = new LoyaltyDiscount(0); 
        double result = discount.applyDiscount(100);
        assertEquals(100.0, result, "0% discount on 100 should be 100.0");
    }
}

