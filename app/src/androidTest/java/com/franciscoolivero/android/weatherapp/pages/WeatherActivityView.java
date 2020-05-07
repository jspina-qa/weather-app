package com.franciscoolivero.android.weatherapp.pages;

import androidx.test.espresso.ViewInteraction;
import static androidx.test.espresso.Espresso.onView;
import com.franciscoolivero.android.weatherapp.utils.TestData;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import com.franciscoolivero.android.weatherapp.R;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class WeatherActivityView {

    public static final ViewInteraction todayTab = onView(withText(TestData.TODAY_TAB_COPY));
    public static final ViewInteraction dailyTab = onView(withText(TestData.DAILY_TAB_COPY));
    public static final ViewInteraction settingsMenu = onView(withId(R.id.more));
}
