package com.wordle.app;

import java.util.Scanner;


public class Wordle {
    private int current_round;
    private ExpectedWord expected_word;
    private final int max_rounds_count = 6;
    private final String[] expected_words = {"apple", "table", "chair",
     "house", "heart", "place", "money", "water", "world", "night", "bread",
      "glass", "month", "music", "store", "beach", "clock", "plant", "stone", 
      "train", "light", "phone", "plane", "shape", "dream", "flame", "party", 
      "smile", "brain", "watch", "voice", "earth", "peace", "sense", "crown", 
      "ocean", "sugar", "river", "blood", "power", "fruit", "glass", "cabin",
      "block", "field", "track", "thing", "storm", "space"};
   
    private void game() {
        System.out.println("Try to guess the word: XXXXX");
        System.out.println("You have 6 tries.");

        while (current_round <= max_rounds_count) {
            System.out.print("Try #" + current_round + ": ");
            
            @SuppressWarnings("resource")
            Scanner stringScanner = new Scanner(System.in);
            String user_word = stringScanner.next();
            
            if (user_word.length() == 5) {
                String compare_result = expected_word.compare_with(user_word);
                System.out.println(compare_result);
    
                if (expected_word.is_word_guessed()) {
                    break;
                }
                current_round++;
            } else {
                System.out.println("A word should have only 5 letters");
            }

            
        }
        
        if (expected_word.is_word_guessed()) {
            System.out.println("Yes! It's correct word!");
        } else {
            System.out.println("Try again.");
        }
    }

    public void start_game() {
        current_round = 1;
        int word_index = (int)(Math.random() * 49);
        String word = expected_words[word_index];
        expected_word = new ExpectedWord(word);
        game();
    }
}
