package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива!\n");
        int[] operationArr = new int[scanner.nextInt()];
        for (int i = 0; i < operationArr.length; i++) {
            System.out.print("Введите элемент массива " + (i + 1) + "/" + operationArr.length + ": ");
            operationArr[i] = scanner.nextInt();
        }
        ArrSum arrSum = new ArrSum();
        ArrProd arrProd = new ArrProd();
        System.out.print("\n Сумма элементов:" + arrSum.fold(operationArr));
        System.out.print("\n Произведение элементов:" + arrProd.fold(operationArr));
    }
}
