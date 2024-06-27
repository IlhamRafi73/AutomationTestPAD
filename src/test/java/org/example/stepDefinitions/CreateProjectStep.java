package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.object.Browserdriver;
import org.example.project.ProjectPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateProjectStep {
    WebDriver driver = Browserdriver.driver;
    String name = "UI Automation";
    String desc = "Automation Testing";
    ProjectPage page = new ProjectPage();

    @Given("user is on dashboard")
    public void user_is_on_dashboard() throws InterruptedException {
        Assertions.assertTrue(driver.getCurrentUrl().equals("http://10.33.35.38:8000/admin/insight"));
        Thread.sleep(3000);
    }

    @When("user navigates to project page")
    public void user_navigates_to_project_page() throws InterruptedException {
        page.navigateToSidebar();
        Thread.sleep(3000);
        page.navigateProjectPage();
        Thread.sleep(3000);
    }

    @When("user click button add project")
    public void user_click_button_add_project() throws InterruptedException {
        page.clickAddProject();
        Thread.sleep(3000);
    }

    @When("user submit a project")
    public void user_submit_a_project() throws InterruptedException {
        page.setInputProject(name, desc);
        Thread.sleep(2000);
        page.clickSubmitProject();
        Thread.sleep(3000);
    }

    @Then("the new project should appear on project page")
    public void the_new_project_should_appear_on_project_page() throws InterruptedException {
        WebElement text = driver.findElement(By.xpath("//*[contains(text(), '" + name + "')]"));
        text.isDisplayed();
    }

}
