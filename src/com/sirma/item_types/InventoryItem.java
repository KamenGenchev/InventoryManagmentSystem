package com.sirma.item_types;

public class InventoryItem extends AbstractItem{
    String ItemID;
    int quantity;

    private static int idCount = 0;

    public InventoryItem(String name, String category, String description, double price, int quantity) {
        super(name, category, description, price);
        this.ItemID = getID();
        this.quantity = quantity;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String getID() {
        return String.valueOf(idCount++);
    }
}
