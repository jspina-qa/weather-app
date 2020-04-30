package com.franciscoolivero.android.weatherapp.utils;

import androidx.test.espresso.ViewInteraction;

import junit.framework.AssertionFailedError;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class EspressoHelperMethods {


    public static void sleep(float seconds) {
        try {
            Thread.sleep(Math.round(1000 * seconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForViewToAppear(ViewInteraction view, int max_tries) {
        boolean isItemHidden = true;
        int count = 0;

        while (isItemHidden && count++ < max_tries) {
            try {
                view.check(matches(isDisplayed()));
                isItemHidden = false;
            } catch (AssertionFailedError e) {
                //Item wasn't found, is probably loading. Wait an try again
                sleep(0.5f);
            }
        }
    }

    public static void waitForViewToAppear(ViewInteraction view) {
        boolean isItemHidden = true;
        int count = 0;

        while (isItemHidden && count++ < 14) {
            try {
                view.check(matches(isDisplayed()));
                isItemHidden = false;
            } catch (AssertionFailedError e) {
                //Item wasn't found, is probably loading. Wait an try again
                sleep(0.5f);
            }
        }
    }

}

