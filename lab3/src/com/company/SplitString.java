package com.company;

public class SplitString {
    public String string;

    public SplitString (String string){
        this.string = string;
    }
    public void printAllWords() {
        int lastWordStart = 0;
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == ' ') {
                System.out.print(string.substring(lastWordStart, i) + '\n');
                lastWordStart = i + 1;
            }
        }
        System.out.print(string.substring(lastWordStart, string.length()));
    }
}
