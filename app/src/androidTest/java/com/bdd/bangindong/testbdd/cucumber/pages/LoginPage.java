package com.bdd.bangindong.testbdd.cucumber.pages;


import com.bdd.bangindong.testbdd.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage extends BasePage {

    public LoginPage() {
        onView(withId(R.id.login_activity)).check(matches(isDisplayed()));
    }
}
