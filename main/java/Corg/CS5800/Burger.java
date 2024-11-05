package Corg.CS5800;

public class Burger implements FoodItem {
    private double price;

    public Burger() {
        this.price = 5.0;
    }

    @Override
    public double getCost() {
        return price;
    }
}
