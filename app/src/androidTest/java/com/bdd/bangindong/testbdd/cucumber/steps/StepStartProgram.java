package com.bdd.bangindong.testbdd.cucumber.steps;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.bdd.bangindong.testbdd.SplashActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class StepStartProgram {
    private Activity mActivity;

    @Rule
    private ActivityTestRule<SplashActivity> mActivityRule = new ActivityTestRule<SplashActivity>(SplashActivity.class,
            false, false);

    @Before
    public void setUp() throws Exception{
        mActivity = mActivityRule.launchActivity(new Intent());
        assertNotNull(mActivity);
    }

    @After
    public void tearDown() throws Exception {

    }
}
