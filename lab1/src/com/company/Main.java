package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Введите N: ");
        while (true) // ввод числа строк
        {
            Scanner scan = new Scanner(System.in);
            try
            {
                n = scan.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
                System.out.print("Пожалуйста, введите число: ");
            }
        }
        String[] str = new String[n];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = scan.nextLine();
        }
        int shortest = 0;
        for (int i = 0; i < n; i++)
        {
            if (str[i].length() < str[shortest].length())
                shortest = i;
        }
        System.out.print(
                "Самая короткая строка - " + str[shortest] + ".\n" +
                "Её длина - " + str[shortest].length() + " симв."
        );
    }
}