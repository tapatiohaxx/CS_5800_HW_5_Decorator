package Corg.CS5800;

abstract class ToppingDecorator implements FoodItem {
    protected FoodItem decoratedItem;

    public ToppingDecorator(FoodItem decoratedItem) {
        this.decoratedItem = decoratedItem;
    }
}
