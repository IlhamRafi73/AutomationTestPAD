package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.auth.LogoutPage;
import org.example.object.Browserdriver;
import org.example.project.ProjectPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DeleteProjectStep {
    WebDriver driver = Browserdriver.driver;
    String data = "UI Automation";
    ProjectPage page = new ProjectPage();

    @Given("user is on project page")
    public void user_is_on_dashboard() throws InterruptedException {
        Assertions.assertTrue(driver.getCurrentUrl().equals("http://10.33.35.38:8000/admin/project"));
        Thread.sleep(3000);
    }

    @When("user click button delete project")
    public void user_click_button_delete() throws InterruptedException {
        page.clickDeleteProject(data);
        Thread.sleep(3000);
    }

    @When("confirm to delete data")
    public void confirm_to_delete_data() throws InterruptedException {
        page.modalDelete();
        Thread.sleep(2000);
    }

    @Then("deleted data is not displayed")
    public void deleted_data_is_not_displayed() throws InterruptedException {
        page.confirmDelete();
        Thread.sleep(4000);
    }

}
