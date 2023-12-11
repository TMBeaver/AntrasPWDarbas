package com.example.task2;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    // This rule launches the MainActivity before each test
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEditTextInput() {
        // Type text into the EditText
        Espresso.onView(ViewMatchers.withId(R.id.editText))
                .perform(ViewActions.typeText("Hello"), ViewActions.closeSoftKeyboard());

        // Click the count button
        Espresso.onView(ViewMatchers.withId(R.id.countButton)).perform(ViewActions.click());

        // Check if the resultTextView displays the correct result
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Result: 1")));
    }

    @Test
    public void testSpinnerSelection() {
        // Select "Characters" from the spinner
        Espresso.onView(ViewMatchers.withId(R.id.spinner))
                .perform(ViewActions.click());
        Espresso.onData(ViewMatchers.is("Characters")).perform(ViewActions.click());

        // Click the count button
        Espresso.onView(ViewMatchers.withId(R.id.countButton)).perform(ViewActions.click());

        // Check if the resultTextView displays the correct result
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Result: 0")));
    }
}
