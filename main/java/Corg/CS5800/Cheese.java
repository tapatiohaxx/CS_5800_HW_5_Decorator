package Corg.CS5800;

public class Cheese extends ToppingDecorator {
    private double price = 0.5;

    public Cheese(FoodItem decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public double getCost() {
        return decoratedItem.getCost() + price;
    }
}
