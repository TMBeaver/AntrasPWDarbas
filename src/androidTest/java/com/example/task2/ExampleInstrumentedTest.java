package com.example.task2;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;


import org.junit.Test;


public class ExampleInstrumentedTest {


    @Test
    public void testCharacterCount() {

        Espresso.onView(ViewMatchers.withId(R.id.editText))
                .perform(ViewActions.typeText("Hello, this is a test string"));


        Espresso.onView(ViewMatchers.withId(R.id.countButton))
                .perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.countButton))
                .perform(ViewActions.click());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Espresso.onView(ViewMatchers.withId(R.id.countButton))
                .check(matches(isDisplayed()))
                .check(matches(withText("Character count: 30\nWord count: 6")));

    }


}
