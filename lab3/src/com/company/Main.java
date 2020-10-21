package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        printAllWords(inputString);
    }

    static void printAllWords(String string) {
        int lastWordStart = 0;
        for (int i = 0; i <= string.length(); ++i) {
            if (i == string.length() || string.charAt(i) == ' ') {
                System.out.print(string.substring(lastWordStart,i) + '\n');
                lastWordStart = i + 1;
            }
        }
    }
}
