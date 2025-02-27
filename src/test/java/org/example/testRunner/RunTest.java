package org.example.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "org.example",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"})
public class RunTest {

}