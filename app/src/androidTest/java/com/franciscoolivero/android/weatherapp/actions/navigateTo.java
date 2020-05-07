package com.franciscoolivero.android.weatherapp.actions;

import androidx.test.espresso.action.ViewActions;

import com.franciscoolivero.android.weatherapp.pages.*;
import com.franciscoolivero.android.weatherapp.view.WeatherActivity;

public class navigateTo {

    public static void todayTab(){
        WeatherActivityView.todayTab.perform(ViewActions.click());
    }

    public static void dailyTab(){
        WeatherActivityView.dailyTab.perform(ViewActions.click());
    }

    public static void settings(){
        WeatherActivityView.settingsMenu.perform(ViewActions.click());
    }
}
