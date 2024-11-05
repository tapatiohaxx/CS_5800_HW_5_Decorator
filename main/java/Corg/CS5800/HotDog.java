package Corg.CS5800;

public class HotDog implements FoodItem {
    private double price;

    public HotDog() {
        this.price = 3.0;  // base price for a hot dog
    }

    @Override
    public double getCost() {
        return price;
    }
}
