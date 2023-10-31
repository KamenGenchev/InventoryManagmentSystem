package com.sirma.item_types;

import com.sirma.interfaces.*;

import static com.sirma.settings.ItemStatusConstants.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    String name;
    String category;
    String description;
    double price;
    boolean broken;
    boolean perished;

    public AbstractItem(String name, String category, String description, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
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
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getItemDetails() {
        return "Name: " + name + "\nCategory: " + category + "\nPrice: $" + price;
    }

    @Override
    public double getValue() {
        if (broken){
            return price / BROKEN_DISCOUNT;
        }
        if (perished) {
            return price / PERISHED_DISCOUNT;
        }
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
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
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
