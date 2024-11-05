package Corg.CS5800;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        FoodItem cheeseBurger = new Cheese(burger);
        FoodItem baconCheeseBurger = new Bacon(cheeseBurger);

        Order order = new Order();
        order.addItem(cheeseBurger);
        order.addItem(baconCheeseBurger);
        order.addItem(new Fries());

        LoyaltyDiscount loyalty = new LoyaltyDiscount(10);  // 10% discount
        double totalCost = order.getTotalCost();
        double discountedCost = loyalty.applyDiscount(totalCost);

        System.out.println("Total cost before discount: " + totalCost);
        System.out.println("Total cost after discount: " + discountedCost);
    }
}
