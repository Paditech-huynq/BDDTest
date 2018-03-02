package com.bdd.bangindong.testbdd.cucumber.steps;


import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.bdd.bangindong.testbdd.SplashActivity;
import com.bdd.bangindong.testbdd.cucumber.pages.BasePage;
import com.bdd.bangindong.testbdd.cucumber.pages.SplashPage;
import com.bdd.bangindong.testbdd.until.ActivityFinisher;

import org.junit.Rule;
import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class StepStartProgram {

    private Activity mActivity;
    private BasePage mCurrenPage;

    @Rule
    private ActivityTestRule<SplashActivity> mActivityRule = new ActivityTestRule<>(SplashActivity.class,
            false, false);

    @Before
    public void setUp() throws Exception{
        mActivity = mActivityRule.launchActivity(new Intent());
        assertNotNull(mActivity);
    }

    @After
    public void tearDown() throws Exception {
        ActivityFinisher.finishOpenActivities();
    }

    @Given("^I have Splash screen$")
    public void iHaveSplashScreen()  {
        mCurrenPage = new SplashPage();
    }

    @When("^I wait (\\d+) second$")
    public void iWaitSecond(int arg0) {

    }

    @Then("^Change to LoginActivity$")
    public void changeToLoginActivity()  {

    }
}
