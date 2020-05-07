package com.franciscoolivero.android.weatherapp.tests.dailypage;

import androidx.test.rule.ActivityTestRule;

import com.franciscoolivero.android.weatherapp.actions.navigateTo;
import com.franciscoolivero.android.weatherapp.pages.todaypage.CurrentWeatherFragmentPage;
import com.franciscoolivero.android.weatherapp.utils.BaseEspressoTest;
import com.franciscoolivero.android.weatherapp.view.WeatherActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DailyMainPageTests extends BaseEspressoTest {

    // Test: tapeas la Daily tab, y assert que este seleccionada, y muestre los elementos de esa pag

    @Rule
    public ActivityTestRule<WeatherActivity> MainActivity = new ActivityTestRule<>(WeatherActivity.class);

    @Before
    public void init(){
        CurrentWeatherFragmentPage.waitForCurrentWheaterFragmentToFinishLoading();
    }

    @After
    public void tearDown(){
        MainActivity.finishActivity();
    }

    @Test
    public void goToDailyTab(){
        navigateTo.dailyTab();
    }
}
