package com.company;

public class Cart {
    private Item[] items;
    private int itemsInCart = 0;
    public Cart(int capacity)
    {
        items = new Item[capacity];
    }
    public boolean add_item(Item item)
    {
        if (itemsInCart < items.length)
        {
            items[itemsInCart++] = item;
            return true;
        }
        else
        {
            System.out.print("Ошибка: корзина уже заполнена!");
            return false;
        }
    }
    public boolean del_last_item()
    {
        if (itemsInCart > 0)
        {
            items[--itemsInCart] = null;
            return true;
        }
        else
        {
            System.out.print("Ошибка: корзина пуста!");
            return false;
        }
    }
    public boolean del_first_item()
    {
        if (itemsInCart > 0)
        {
            for (int i = 0; i < itemsInCart; ++i)
            {
                if (i != itemsInCart)
                    items[i] = items[i + 1];
                else
                    items[i] = null;
                return true;
            }
            itemsInCart--;
        }
        else
            System.out.print("Ошибка: корзина пуста!");
        return false;
    }
    public float get_total_price()
    {
        float return_value = 0;
        for (int i = 0; i < itemsInCart; ++i)
        {
            return_value += items[i].price;
        }
        return return_value;
    }
    public void raisePricePercent(float percent)
    {
        for (int i = 0; i < itemsInCart; ++i)
        {
            items[i].raisePricePercent(percent);
        }
    }
    public void lowerPricePercent(float percent)
    {
        for (int i = 0; i < itemsInCart; ++i)
        {
            items[i].lowerPricePercent(percent);
        }
    }
}
