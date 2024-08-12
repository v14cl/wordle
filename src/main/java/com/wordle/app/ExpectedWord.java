package com.wordle.app;

public class ExpectedWord {
    private final String exp_word;
    private final int word_size = 5;
    private boolean is_guessed;

    ExpectedWord(String word) {
        exp_word = word;
        is_guessed = false;
        System.out.println(word);
    }
    
    private String get_fmt_user_word(String user_word) {
        String formatted_user_word = "";
        for (int i = 0; i < word_size; i++) {
            if (user_word.charAt(i) == exp_word.charAt(i)) {
                formatted_user_word += '[';
                formatted_user_word += user_word.charAt(i);
                formatted_user_word += ']';
                continue;
            }
            
            String formatted_letter = "";
            for (int j = 0; j < word_size; j++) {
                if (user_word.charAt(i) == exp_word.charAt(j) && i != j) {
                    formatted_letter += '('; 
                    formatted_letter += user_word.charAt(i); 
                    formatted_letter += ')';
                    break;
                }
            }
            if (formatted_letter.isEmpty()) {
                formatted_letter += user_word.charAt(i);
            }
            formatted_user_word += formatted_letter;
        }
        return formatted_user_word;
    }



    public String compare_with(String user_word) {
        is_guessed = exp_word.equals(user_word);
        return get_fmt_user_word(user_word);
    }

    public boolean is_word_guessed() {
        return is_guessed;
    }
}
