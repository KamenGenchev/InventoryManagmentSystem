package com.sirma.item_types;

import com.sirma.interfaces.Breakable;

public class FragileItem extends InventoryItem implements Breakable {
    boolean broken;
    public FragileItem(String name, String category, String description, double price, int quantity) {
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
        return 0;
    }
}
