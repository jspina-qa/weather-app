package com.franciscoolivero.android.weatherapp.utils;

import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.test.espresso.ViewInteraction;

import com.franciscoolivero.android.weatherapp.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withResourceName;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class TestViews {

    //Current Weather Fragment
    public static final ViewInteraction currentWeatherFragmentHourlyForecastLocation = onView(withId(R.id.location));
    public static final ViewInteraction currentWeatherFragmentHourlyForecastHeader = onView(withText(TestData.HOURLY_FORECAST_COPY));
    public static final ViewInteraction currentWeatherFragmentCurrentTemperature = onView(withId(R.id.temperature));

    //Global
    public static final ViewInteraction nestedScrollView = onView(allOf(isAssignableFrom(NestedScrollView.class), isDisplayed()));
    public static final ViewInteraction scrollView = onView(allOf(isAssignableFrom(ScrollView.class), isDisplayed()));

    public static final ViewInteraction searchBarClearButton = onView(withId(R.id.search_close_btn));

    //SearchBar
    public static final ViewInteraction searchBarCloseButton = onView(allOf(withResourceName(TestData.SEARCH_CLOSE_BUTTON), isDisplayed()));
    public static final ViewInteraction searchBarText = onView(allOf(withResourceName(TestData.SEARCH_BAR_TEXT), isDisplayed()));
    public static final ViewInteraction searchBarMagIcon = onView(allOf(isAssignableFrom(AppCompatImageView.class),
            withParent(isAssignableFrom(LinearLayout.class)), isDisplayed(), withResourceName(TestData.SEARCH_MAG_ICON)));

}

