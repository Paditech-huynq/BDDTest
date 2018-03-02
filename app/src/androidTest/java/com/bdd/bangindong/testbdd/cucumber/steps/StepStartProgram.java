package com.bdd.bangindong.testbdd.cucumber.steps;


import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.bdd.bangindong.testbdd.LoginActivity;
import com.bdd.bangindong.testbdd.SplashActivity;
import com.bdd.bangindong.testbdd.cucumber.pages.BasePage;
import com.bdd.bangindong.testbdd.cucumber.pages.LoginPage;
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

public class StepStartProgram{

    BasePage mCurrenPage;
    Activity mActivity;
    @Rule
    private ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class,
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
        this.mCurrenPage = new SplashPage();
    }

    @When("^I wait (\\d+) second$")
    public void iWaitSecond(int arg0) {
        try {
            Thread.sleep((long)(arg0*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^Change to LoginActivity$")
    public void changeToLoginActivity()  {
        mCurrenPage = new LoginPage();
    }
}
