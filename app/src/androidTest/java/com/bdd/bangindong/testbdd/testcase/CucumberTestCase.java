package com.bdd.bangindong.testbdd.testcase;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "features/Login.feature",
        glue = {"com.bdd.bangindong.testbdd.cucumber.steps"},
        format = {"pretty",
                "html:/data/data/com.bdd.bangindong.testbdd/cucumber-reports/html-report",
                "json:/data/data/com.bdd.bangindong.testbdd/cucumber-reports/cucumber.json",
                "junit:/data/data/com.bdd.bangindong.testbdd/cucumber-reports/cucumber.xml"
        })
public class CucumberTestCase {
}
