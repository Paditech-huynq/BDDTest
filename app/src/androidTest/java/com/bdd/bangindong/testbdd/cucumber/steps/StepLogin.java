package com.bdd.bangindong.testbdd.cucumber.steps;


import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.bdd.bangindong.testbdd.LoginActivity;
import com.bdd.bangindong.testbdd.cucumber.pages.BasePage;
import com.bdd.bangindong.testbdd.cucumber.pages.LoginPage;
import com.bdd.bangindong.testbdd.cucumber.pages.WelcomePage;
import com.bdd.bangindong.testbdd.until.ActivityFinisher;

import org.junit.Rule;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertNotNull;

public class StepLogin  {

    Activity mActivity;
    BasePage mCurrenPage;

    @Given("^I see login activity$")
    public void iSeeLoginActivity() throws Throwable {
        mCurrenPage = new LoginPage();
    }

    @Then("^I see welcome activity$")
    public void iSeeWelcomeActivity() throws Throwable {
        mCurrenPage = new WelcomePage();
    }

    @When("^I fill \"([^\"]*)\" and \"([^\"]*)\" in username and pass editext$")
    public void iFillAndInUsernameAndPassEditext(String arg0, String arg1) throws Throwable {
        mCurrenPage.is(LoginPage.class).fillAccount(arg0,arg1);
    }
}
