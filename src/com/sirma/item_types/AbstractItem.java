package com.sirma.item_types;

import com.sirma.interfaces.*;

import static com.sirma.settings.ItemStatusConstants.*;

public abstract class AbstractItem implements Item, Categorizable, Sellable {
    String name;
    String category;
    String description;
    double price;


    public AbstractItem(String name, String category, String description, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
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
    public String getDescription() {
        return this.description;
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
