package com.example.alejo.calculadora;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.util.regex.Pattern.matches;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */



@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

   //Para que se inicie la app en el telefono indicando con cual actividad va a empezar, en este caso en MainActivity
    @Rule
    public IntentsTestRule<MainActivity> mActivityTestRule =
            new IntentsTestRule<>(MainActivity.class);


    @Test
    public void useAppContext2() throws InterruptedException
    {
        onView(withId(R.id.txtNumeroUno)).perform(ViewActions.typeText("3"));
        Thread.sleep(3000);
        onView(withId(R.id.txtNumeroDos)).perform(ViewActions.typeText("3"));

        onView(withId(R.id.btnSumar)).perform(ViewActions.click());

        onView(withId(R.id.tvResultado)).check(ViewAssertions.matches(withText(("Resultado: 6"))));

    }
}
