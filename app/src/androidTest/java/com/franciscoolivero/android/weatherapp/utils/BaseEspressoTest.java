package com.franciscoolivero.android.weatherapp.utils;

import androidx.test.rule.GrantPermissionRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;


public abstract class BaseEspressoTest {

    @Rule
    public GrantPermissionRule mRuntimePermissionRule = GrantPermissionRule.grant(
            android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Before
    public void init() {

    }

    @After
    public void tearDown() {

    }
}

