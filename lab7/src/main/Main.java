package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import guesser.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите минимальное значение: ");
            int min = scanner.nextInt();
            System.out.println("Введите максимальное значение: ");
            int max = scanner.nextInt();
            Guesser guesser = new Guesser(min, max);
            boolean guessed = false;
            while (!guessed) {
                System.out.print("Введите число: ");
                try {
                    guessed = guesser.guess(scanner.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Пожалуйста, введите число!");
                    scanner.next();
                    continue;
                } catch (GuessedOutOfBoundsException e) {
                    System.out.println(e);
                    continue;
                }
                System.out.println("Неверно! Попробуйте ещё раз.");
            }
            System.out.println("Верно! Вы угадали.\nЕщё раз? (да/нет)");
            if (!scanner.next().contains("да"))
                break;
        }
    }
}