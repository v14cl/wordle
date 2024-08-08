package com.wordle.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String[] words = {"apple", "bread", "dream", "house", "smile"};
        wordle(words); 
    }
    
    public static void wordle(String[] words) {
        System.out.println("Try to guess the word");
        System.out.println("You have 6 tries");
        int word_index = (int)(Math.random() * 4);
        String word = words[word_index];

        @SuppressWarnings("resource")
        Scanner stringScanner = new Scanner(System.in);
        String answer = stringScanner.next();
        String mod_answer = answer;
        int i = 0;
        int round = 1;
        while (round < 7) {
        int offset = 0;
            for (i = 0; i < mod_answer.length() - offset; i++) {
                for (int j = 0; j < word.length(); j++) {    
                    if (mod_answer.equals(word)) {
                        System.out.println("YEAH! It's " + word + "!");
                        return;
                        
                    } else if (i == 0 && mod_answer.charAt(i + offset) == word.charAt(j) && i != j &&
                    mod_answer.charAt(i + offset + 1) != ')' && mod_answer.charAt(i + offset + 1) != ']') {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")" + mod_answer.substring(i + offset + 1);
                        offset = offset + 2;

                    } else if (i == 0 && mod_answer.charAt(i + offset) == word.charAt(j) && i == j &&
                        mod_answer.charAt(i + offset + 1) != ')' && mod_answer.charAt(i + offset + 1) != ')') {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]" + mod_answer.substring(i + offset + 1);
                        offset = offset + 2;

                    } else if (i == 4 && mod_answer.charAt(i + offset) == word.charAt(j) && i != j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '(') {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")" + mod_answer.substring(i + offset + 1);
                        offset = offset + 2;

                    } else if (i == 4 && mod_answer.charAt(i + offset) == word.charAt(j) && i == j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '[') {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]" + mod_answer.substring(i + offset + 1);
                        offset = offset + 2;

                    } else if (mod_answer.charAt(i + offset) == word.charAt(j) && i != j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '[') {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")" + mod_answer.substring(i + offset + 1);
                        offset = offset + 2;
                    
                    } else if (mod_answer.charAt(i + offset) == word.charAt(j) && i == j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '[') {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]" + mod_answer.substring(i + offset + 1);
                        offset = offset + 2;
                    }
                }
            }
            round++;
            System.out.println(mod_answer);
            answer = stringScanner.next();
            mod_answer = answer;
        }
    }
}
