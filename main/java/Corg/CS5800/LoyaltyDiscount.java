package Corg.CS5800;

public class LoyaltyDiscount {
    private double discountPercentage;

    public LoyaltyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double applyDiscount(double totalCost) {
        return totalCost * (1 - discountPercentage / 100.0);
    }
}

