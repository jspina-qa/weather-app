package com.franciscoolivero.android.weatherapp.tests.todaypage;

import androidx.test.rule.ActivityTestRule;

import com.franciscoolivero.android.weatherapp.pages.todaypage.CurrentWeatherFragmentPage;
import com.franciscoolivero.android.weatherapp.utils.BaseEspressoTest;
import com.franciscoolivero.android.weatherapp.view.CurrentWeatherFragment;
import com.franciscoolivero.android.weatherapp.view.WeatherActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CurrentWeatherFragmentTests extends BaseEspressoTest {

    //Esto le dice a Espresso en que Activity arrancar el test
    @Rule
    public ActivityTestRule<WeatherActivity> mMainActivity = new ActivityTestRule<>(WeatherActivity.class);

    //Aca iria codigo que necesitas que se ocurra al inicio de cada test, como 'Espera a que haya cargado la pagina'
    @Before
    public void init() {
        //El metodo es medio tramposo porque espera a que se muestre un elemento que solo se muestra
        //cuando se haya completado la llamada, hay formas mejores de hacerlo pero requieren meter mano
        //en el codigo de la aplicacion (EspressoIdlingResources) entonces quiza no sea la mejooor forma, es
        //la que recomienda google, pero a la vez tenes a gente metiendo mano en codigo
        CurrentWeatherFragmentPage.waitForCurrentWheaterFragmentToFinishLoading();
    }

    @After
    public void tearDown() {
        mMainActivity.finishActivity();
    }

    /*************************************************************************************************
     * Test
     * GIVEN the user is in the TODAY tab
     * WHEN the data finishes loading
     * THEN assert the hourly forecast copy is displayed
     * AND assert the current temperature is displayed
     * Test Case: 0123456
     *************************************************************************************************/
    //@Test
    // As per this test is to get the idea I'll comment it out so the actual tests are separated from the run
    public void testSomeSuccessHappens() {
        CurrentWeatherFragmentPage.assertHourlyForecastHeaderIsDisplayed();
        CurrentWeatherFragmentPage.assertTemperatureIsDisplayed();
    }

    /*************************************************************************************************
     * Test
     * GIVEN the user is in the TODAY tab
     * WHEN the data finishes loading
     * THEN assert the hourly forecast copy is displayed
     * AND assert the current temperature is not displayed
     * Test Case: 0123456
     *************************************************************************************************/
    //@Test
    // As per this test is to get the idea I'll comment it out so the actual tests are separated from the run
    public void testSomeErrorHappens() {
        CurrentWeatherFragmentPage.assertHourlyForecastHeaderIsDisplayed();
        CurrentWeatherFragmentPage.assertTemperatureIsNotDisplayed();
    }

    /*************************************************************************************************
     * Test
     * GIVEN the app has loaded
     * AND visible to the user
     * WHEN the user checks the Today tab
     * THEN today's date is displayed at the top of the tab's frame.
     * Test Case: ####
     *************************************************************************************************/

    @Test
    public void testAllIsDisplayed(){
        CurrentWeatherFragmentPage.assertTodayDateIsDisplayed();
        CurrentWeatherFragmentPage.assertLocationIsDisplayed();
        CurrentWeatherFragmentPage.assertWeatherIconIsDisplayed();
        CurrentWeatherFragmentPage.assertCurrentWeatherDescriptionIsDisplayed();
        CurrentWeatherFragmentPage.assertTemperatureIsDisplayed();
        //CurrentWeatherFragmentPage.assertRealFeelLabelIsDisplayed();
        CurrentWeatherFragmentPage.assertCurrentRealFeelIsDisplayed();
        CurrentWeatherFragmentPage.assertPressureLabelIsDisplayed();
        CurrentWeatherFragmentPage.assertCurrentPressureIsDisplayed();
        CurrentWeatherFragmentPage.assertHumidityLabelIsDisplayed();
        CurrentWeatherFragmentPage.assertCurrentHumidityIsDisplayed();
        CurrentWeatherFragmentPage.assertWindLabelIsDisplayed();
        CurrentWeatherFragmentPage.assertCurrentWindIsDisplayed();
    }


    /*************************************************************************************************
     * Test
     * GIVEN
     * WHEN
     * THEN
     * Test Case: ####
     *************************************************************************************************/
}
