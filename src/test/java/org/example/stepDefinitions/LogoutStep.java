package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LogoutPage;
import org.example.object.Browserdriver;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class LogoutStep {
    @Given("user is logged in")
    public void user_is_logged_in() throws InterruptedException {
        Assertions.assertTrue(Browserdriver.driver.getCurrentUrl().equals("http://10.33.35.38:8000/admin/insight"));
        Thread.sleep(3000);
    }

    @When("user clicks on the logout button")
    public void user_clicks_on_the_logout_button() throws InterruptedException {
        LogoutPage logout = new LogoutPage(Browserdriver.driver);
        logout.hoverLogout();
        Thread.sleep(4000);
        logout.clickLogout();
        Thread.sleep(3000);
    }

    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() throws InterruptedException {
        LogoutPage logout = new LogoutPage(Browserdriver.driver);
        String expectedUrl = "http://10.33.35.38:8000/";
        assertEquals(expectedUrl,logout.getUrl());
        Thread.sleep(4000);
    }
}
