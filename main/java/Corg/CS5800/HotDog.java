package Corg.CS5800;

public class HotDog implements FoodItem {
    private double price;

    public HotDog() {
        this.price = 3.0; 
    }

    @Override
    public double getCost() {
        return price;
    }
}
