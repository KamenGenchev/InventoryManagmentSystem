package com.sirma.item_types;

import com.sirma.interfaces.Perishable;

import static com.sirma.settings.ItemStatusConstants.PERISHED_DISCOUNT_PERCENTAGE;

public class GroceryItem extends InventoryItem implements Perishable {
    boolean perished;
    public GroceryItem(String name, String category, String description, double price, int quantity) {
        super(name, category, description, price, quantity);
    }

    @Override
    public boolean isPerishable() {
        return true;
    }

    @Override
    public void Perish() {
        perished = true;
    }

    @Override
    public double getValue() {
        if (perished) {
            return super.getValue() / PERISHED_DISCOUNT_PERCENTAGE;
        }
        return super.getValue();
    }
}
