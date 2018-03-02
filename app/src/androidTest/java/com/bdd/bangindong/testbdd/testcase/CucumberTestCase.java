package com.bdd.bangindong.testbdd.testcase;

import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "features/Login.feature",
        glue = {"com.bdd.bangindong.testbdd.cucumber.steps"},
        format = {"pretty",
                "html:/data/data/com.bdd.bangindong.testbdd/cucumber-reports/html-report",
                "json:/data/data/com.bdd.bangindong.testbdd/cucumber-reports/cucumber.json",
                "junit:/data/data/com.bdd.bangindong.testbdd/cucumber-reports/cucumber.xml"
        })
@RunWith(AndroidJUnit4.class)
public class CucumberTestCase {
}
