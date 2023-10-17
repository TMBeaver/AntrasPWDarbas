package com.example.task2;

public class WordCharacterCounter {
    public static int countWords(String text) {
        String[] words = text.split("[\\s,\\.]+");
        return words.length;
    }

    public static int countCharacters(String text) {
        return text.length();
    }
}
