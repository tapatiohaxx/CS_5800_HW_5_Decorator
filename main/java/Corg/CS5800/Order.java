package Corg.CS5800;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        return items.stream().mapToDouble(FoodItem::getCost).sum();
    }
}

