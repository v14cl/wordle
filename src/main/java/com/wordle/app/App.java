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
        String word = words[0];
        System.out.println("answer: " + word);

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
                    if (mod_answer == word) {
                        System.out.println("YEAH! It's " + word);
                        System.out.println("1 " + round);
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + " i + offset" + i + offset);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));
                        
                    } else if (i == 0 && mod_answer.charAt(i + offset) == word.charAt(j) && i != j &&
                    mod_answer.charAt(i + offset + 1) != ')' && mod_answer.charAt(i + offset + 1) != ']') {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")" + mod_answer.substring(i + offset + 1);
                        System.out.println("2 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (i == 0 && mod_answer.charAt(i + offset) == word.charAt(j) && i == j &&
                        mod_answer.charAt(i + offset + 1) != ')' && mod_answer.charAt(i + offset + 1) != ')') {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]" + mod_answer.substring(i + offset + 1);
                        System.out.println("3 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (mod_answer.charAt(i + offset) == word.charAt(j) && i == 4 && j != 4) {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")";
                        System.out.println("4 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (mod_answer.charAt(i + offset) == word.charAt(j) && i == 4 && j == 4) {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]";
                        System.out.println("5 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (i == 4 && mod_answer.charAt(i + offset) == word.charAt(j) && i != j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '(') {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")" + mod_answer.substring(i + offset + 1);
                        System.out.println("6 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (i == 4 && mod_answer.charAt(i + offset) == word.charAt(j) && i == j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '[') {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]" + mod_answer.substring(i + offset + 1);
                        System.out.println("7 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (mod_answer.charAt(i + offset) == word.charAt(j) && i == j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '[') {
                        mod_answer = mod_answer.substring(0, i + offset) + "[" + mod_answer.charAt(i + offset) + "]" + mod_answer.substring(i + offset + 1);
                        System.out.println("8 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else if (mod_answer.charAt(i + offset) == word.charAt(j) && i != j &&
                    mod_answer.charAt(i + offset - 1) != '(' && mod_answer.charAt(i + offset - 1) != '[') {
                        mod_answer = mod_answer.substring(0, i + offset) + "(" + mod_answer.charAt(i + offset) + ")" + mod_answer.substring(i + offset + 1);
                        System.out.println("9 " + round);
                        offset = offset + 2;
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + " " + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));

                    } else {
                        System.out.println("10 " + round);
                        System.out.println("mod_answer length: " + mod_answer.length() + " | " + "i + offset " + i + " " + offset + word + " " + answer);
                        System.out.println("i: " + i + " j: " + j);
                        System.out.println("answer letter " + mod_answer.charAt(i) + " word letter " + word.charAt(j));
                    }
                    
                }
            }
            round++;
            System.out.println(mod_answer);
            answer = stringScanner.next();
            mod_answer = answer;
            // System.out.println("index " + word_index);
        }
    }
}