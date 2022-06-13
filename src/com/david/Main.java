package com.david;

import com.david.item.item;
import com.david.order.order;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Setting up Input
        item item1 = new item(1, "apple", "20", 1);
        item item2 = new item(2, "orange", "10", 2);
        item item3 = new item(3, "pear", "14", 2);
        item item4 = new item(4, "carrot", "17", 3);

        order order1 = new order("order001");
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);
        order1.addItem(item4);


        //Transforming Input Data
        order transformedOrder = new order(order1.getOrderId());

        //Transforming the Dataset (Uppercase to ItemName, Sorting reversed with ItemName)
        List<item> transformedItemList = order1.getItemList().stream().map(item -> { item tempItem = new item();
            tempItem.setItemID(item.getItemID());
            tempItem.setAmount(item.getAmount());
            tempItem.setPrice(item.getPrice());
            tempItem.setItemName(item.getItemName().toUpperCase());
            transformedOrder.addItem(tempItem);
            return tempItem;
            }
        ).sorted(Comparator.comparing(item::getItemName).reversed()).collect(Collectors.toList());

        transformedOrder.setItemList(transformedItemList);

        for(item item : transformedOrder.getItemList()) {
            System.out.println(item);
        }
    }
}
