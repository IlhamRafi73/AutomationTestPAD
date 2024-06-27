package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LoginPage;
import org.example.object.Browserdriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        Browserdriver.driver.get("http://10.33.35.38:8000/auth/login");
        Thread.sleep(4000);
    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {

        LoginPage login = new LoginPage(Browserdriver.driver);
        login.setLoginForm("admin@admin.com", "secret");
        Thread.sleep(4000);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        LoginPage login = new LoginPage(Browserdriver.driver);
        login.clickSubmit();
        Thread.sleep(4000);
    }
    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() throws InterruptedException {
        LoginPage login = new LoginPage(Browserdriver.driver);
        Thread.sleep(2000);
        boolean dashboard = login.getHeader();
        assertTrue(dashboard);
        Thread.sleep(2000);
    }
}