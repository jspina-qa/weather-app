package com.franciscoolivero.android.weatherapp.pages.todaypage;

import com.franciscoolivero.android.weatherapp.utils.EspressoHelperMethods;
import com.franciscoolivero.android.weatherapp.utils.TestViews;

import junit.framework.Test;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.Matchers.not;

public class CurrentWeatherFragmentPage {

    public static void waitForCurrentWheaterFragmentToFinishLoading() {
        EspressoHelperMethods.waitForViewToAppear(TestViews.currentWeatherFragmentHourlyForecastLocation);
    }

    public static void assertHourlyForecastHeaderIsDisplayed() {
        TestViews.currentWeatherFragmentCurrentTemperature.check(matches(isDisplayed()));
    }

    public static void assertTemperatureIsDisplayed() {
        TestViews.currentWeatherFragmentHourlyForecastHeader.check(matches(isDisplayed()));
    }

    public static void assertTemperatureIsNotDisplayed() {
        TestViews.currentWeatherFragmentHourlyForecastHeader.check(matches(not(isDisplayed())));
    }

    public static void assertTodayDateIsDisplayed() {
        TestViews.currentWeatherFragmentTodayDate.check(matches(isDisplayed()));
    }

    public static void assertLocationIsDisplayed() {
        TestViews.currentWeatherFragmentHourlyForecastLocation.check(matches(isDisplayed()));
    }

    public static void assertWeatherIconIsDisplayed() {
        TestViews.currentWeatherFragmentCurrentWeatherIcon.check(matches(isDisplayed()));
    }

    public static void assertCurrentWeatherDescriptionIsDisplayed(){
        TestViews.currentWeatherFragmentCurrentWeatherDescription.check(matches(isDisplayed()));
    }

    public static void assertRealFeelLabelIsDisplayed(){
        TestViews.currentWeatherFragmentRealFeelTitle.check(matches(isDisplayed()));
    }

    public static void assertCurrentRealFeelIsDisplayed(){
        TestViews.currentWeatherFragmentCurrentRealFeel.check(matches(isDisplayed()));
    }

    public static void assertPressureLabelIsDisplayed(){
        TestViews.currentWeatherFragmentPressureTitle.check(matches(isDisplayed()));
    }

    public static void assertCurrentPressureIsDisplayed(){
        TestViews.currentWeatherFragmentCurrentPressure.check(matches(isDisplayed()));
    }

    public static void assertHumidityLabelIsDisplayed(){
        TestViews.currentWeatherFragmentHumidityTitle.check(matches(isDisplayed()));
    }

    public static void assertCurrentHumidityIsDisplayed(){
        TestViews.currentWeatherFragmentCurrentHumidity.check(matches(isDisplayed()));
    }

    public static void assertWindLabelIsDisplayed(){
        TestViews.currentWeatherFragmentWindTitle.check(matches(isDisplayed()));
    }

    public static void assertCurrentWindIsDisplayed(){
        TestViews.currentWeatherFragmentCurrentWind.check(matches(isDisplayed()));
    }
}
