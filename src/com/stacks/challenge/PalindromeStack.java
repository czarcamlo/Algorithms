package com.stacks.challenge;

import java.util.LinkedList;
import java.util.Locale;

public class PalindromeStack {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("anitalavalatina"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase(Locale.ROOT);
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            //para saber que no tiene puntuacion ni otro caracter se define que solo contemple caracteres de la a a la z
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        return reverseString.toString().equals(stringNoPunctuation.toString());
    }
}
