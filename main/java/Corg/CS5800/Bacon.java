package Corg.CS5800;

public class Bacon extends ToppingDecorator {
    private double price = 0.7;

    public Bacon(FoodItem decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public double getCost() {
        return decoratedItem.getCost() + price;
    }
}