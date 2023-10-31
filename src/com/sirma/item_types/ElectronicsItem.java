package com.sirma.item_types;

import com.sirma.interfaces.Breakable;

import static com.sirma.settings.ItemStatusConstants.BROKEN_DISCOUNT_PERCENTAGE;

public class ElectronicsItem extends InventoryItem implements Breakable {
    boolean broken;
    public ElectronicsItem(String name, String category, String description, double price, int quantity) {
        super(name, category, description, price, quantity);
    }

    @Override
    public boolean isBreakable() {
        return true;
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public void breakItem() {
        this.broken = true;
    }

    @Override
    public void repair() {
        this.broken = false;
    }

    @Override
    public double getValue() {
        if (broken) {
            return super.getValue() / BROKEN_DISCOUNT_PERCENTAGE;
        }
        return super.getValue();
    }


}
