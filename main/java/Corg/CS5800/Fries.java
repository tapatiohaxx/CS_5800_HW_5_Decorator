package Corg.CS5800;

public class Fries implements FoodItem {
    private double price;

    public Fries() {
        this.price = 2.0;
    }

    @Override
    public double getCost() {
        return price;
    }
}
