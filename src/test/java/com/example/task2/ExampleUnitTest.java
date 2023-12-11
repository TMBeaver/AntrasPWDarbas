package com.example.task2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {


        @Test
        public void countWords_validInput_returnsCorrectCount() {
            String inputText = "This is a sample sentence.";
            int expectedCount = 5; // The sentence has 5 words
            int actualCount = WordCharacterCounter.countWords(inputText);
            assertEquals(expectedCount, actualCount);
        }

        @Test
        public void countWords_emptyInput_returnsZero() {
            String inputText = "";
            int expectedCount = 0; // Empty string should have 0 words
            int actualCount = WordCharacterCounter.countWords(inputText);
            assertEquals(expectedCount, actualCount);
        }
        @Test
        public void countCharacters_validInput_returnsCorrectCount() {
            String inputText = "Hello, World!";
            int expectedCount = 13; // The string has 13 characters
            int actualCount = WordCharacterCounter.countCharacters(inputText);
            assertEquals(expectedCount, actualCount);
        }
    @Test
    public void countCharacters_emptyInput_returnsZero() {
        String inputText = "";
        int expectedCount = 0; // Empty string should have 0 characters
        int actualCount = WordCharacterCounter.countCharacters(inputText);
        assertEquals(expectedCount, actualCount);
    }
    }
