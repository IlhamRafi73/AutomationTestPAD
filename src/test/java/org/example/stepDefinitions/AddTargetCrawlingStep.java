package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.object.Browserdriver;
import org.example.project.ProjectObject;
import org.example.project.ProjectPage;
import org.example.targetcrawl.TargetCrawlPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddTargetCrawlingStep {
    WebDriver driver = Browserdriver.driver;
    String name = "UI Automation";
    String startdate = "2024-06-25";
    String enddate = "2024-06-26";
    TargetCrawlPage page = new TargetCrawlPage();

    @Given("user has selected a project")
    public void user_has_selected_a_project() throws InterruptedException {
        page.hoverSelectProject();
        Thread.sleep(4000);
        page.selectProject();
        Thread.sleep(4000);
    }

    @When("user navigates to target crawling page")
    public void user_navigates_to_target_crawling_page()throws InterruptedException {
        page.navigateToTargetCrawling();
        Thread.sleep(3000);
        Assertions.assertTrue(driver.getCurrentUrl().equals("http://10.33.35.38:8000/admin/keyword"));
        Thread.sleep(3000);

    }

    @When("user click button add target crawl")
    public void user_click_button_add_target_crawl() throws InterruptedException {
        page.clickAddTargetCrawlButton();
        Thread.sleep(3000);
    }

    @When("user submit a target crawl")
    public void user_submit_a_target_crawl() throws InterruptedException {
        page.setTargetCrawlName(name);
        Thread.sleep(2000);
        page.setSourceTargetCrawl();
        Thread.sleep(2000);
        page.setDate(startdate, enddate);
        Thread.sleep(2000);
        page.clickSubmit();
        Thread.sleep(2000);
        page.cilckSave();
        Thread.sleep(2000);
    }

    @Then("the new target crawl should appear on target crawling page")
    public void the_new_target_crawl_should_appear() throws  InterruptedException {
        page.confirmCreate();
    }

}
