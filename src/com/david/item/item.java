package com.david.item;

public class item {
    private int itemID;
    private String itemName;
    private String price;
    private int amount;

    public item() {
    }

    public item(int itemID, String itemName, String price, int amount) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.amount = amount;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "item{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price='" + price + '\'' +
                ", amount=" + amount +
                '}';
    }
}
