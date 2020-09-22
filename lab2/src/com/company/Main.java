package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Cart cart = new Cart(15);
        System.out.println("Добро Пожаловать!");
        while (true) {
            String name; // ввод наименования
            Scanner scanStr = new Scanner(System.in);
            System.out.println("Введите название товара (пустая строка = ''Готово''): ");
            name = scanStr.nextLine();
            if (name.equals(""))
                break;

            float price; // ввод стоимости
            System.out.println("\tВведите стоимость товара: ");
            while (true) {
                Scanner scanFloat = new Scanner(System.in);
                try {
                    price = scanFloat.nextFloat();
                    break;
                } catch (InputMismatchException fg) {
                    System.out.print("\tПожалуйста, введите число: ");
                }
            }

            cart.add_item(new Item(name, price));
        }
        System.out.println("Стоимость корзины: " + cart.get_total_price());
        System.out.println("\tЦены подняты на 15%!");
        cart.raisePricePercent(15);
        System.out.println("Стоимость корзины: " + cart.get_total_price());
        System.out.println("\tЦены подняты ещё на 30%!");
        cart.raisePricePercent(30);
        System.out.println("Стоимость корзины: " + cart.get_total_price());
    }
}