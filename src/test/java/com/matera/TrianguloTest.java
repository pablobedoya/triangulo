package com.matera;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com.matera", monochrome = true, dryRun = false)
public class TrianguloTest {

}
