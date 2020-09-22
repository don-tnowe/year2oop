package com.company;

public class Cart {
    private Item[] items;
    private int itemCount = 0;
    public Cart(int capacity) {
        items = new Item[capacity];
    }
    public boolean add_item(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
            return true;
        }
        else {
            System.out.print("Ошибка: корзина уже заполнена!");
            return false;
        }
    }
    public boolean del_last_item() {
        if (itemCount > 0) {
            items[--itemCount] = null;
            return true;
        }
        else {
            System.out.print("Ошибка: корзина пуста!");
            return false;
        }
    }
    public boolean del_first_item() {
        if (itemCount > 0) {
            for (int i = 0; i < itemCount; ++i) {
                if (i != itemCount)
                    items[i] = items[i + 1];
                else
                    items[i] = null;
            }
            itemCount--;
            return true;
        }
        System.out.print("Ошибка: корзина пуста!");
        return false;
    }
    public float get_total_price() {
        float returnValue = 0;
        for (int i = 0; i < itemCount; ++i) {
            returnValue += items[i].price;
        }
        return returnValue;
    }
    public void raisePricePercent(float percent) {
        for (int i = 0; i < itemCount; ++i) {
            items[i].raisePricePercent(percent);
        }
    }
    public void lowerPricePercent(float percent) {
        for (int i = 0; i < itemCount; ++i) {
            items[i].lowerPricePercent(percent);
        }
    }
    public void printItems() {
        System.out.print("В корзине " + itemCount +" товаров.\n");
        for (int i = 0; i < itemCount; ++i)
            System.out.print(items[i].name + "\n");
    }
}
