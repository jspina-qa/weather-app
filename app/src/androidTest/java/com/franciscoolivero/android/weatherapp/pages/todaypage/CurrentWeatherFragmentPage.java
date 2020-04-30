package com.franciscoolivero.android.weatherapp.pages.todaypage;

import com.franciscoolivero.android.weatherapp.utils.EspressoHelperMethods;
import com.franciscoolivero.android.weatherapp.utils.TestViews;

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
}
