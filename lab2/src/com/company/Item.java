package com.company;

public class Item {
    public String name;
    public float price;
    public Item(String name, float price)
    {
        this.name = name;
        if (price >= 0)
            this.price = price;
        else
            price = 0;
    }
    public void raisePricePercent(float percent) {
        price *= 1.0 + percent * 0.01;
    }
    public void lowerPricePercent(float percent) {
        if (percent < 100)
            price *= 1.0 - percent * 0.01;
        else
            price = 0;
    }
}
