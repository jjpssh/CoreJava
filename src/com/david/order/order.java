package com.david.order;

import com.david.item.item;

import java.util.ArrayList;
import java.util.List;

public class order {
    private String orderId;
    private List<item> itemList;

    public order(String orderId) {
        this.orderId = orderId;
        itemList = new ArrayList<>();
    }

    public void addItem(item item){
        itemList.add(item);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<item> getItemList() {
        return itemList;
    }

    public void setItemList(List<item> itemList) {
        this.itemList = itemList;
    }

}
