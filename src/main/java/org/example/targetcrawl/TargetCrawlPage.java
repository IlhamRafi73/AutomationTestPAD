package org.example.targetcrawl;

import org.example.auth.AuthObject;
import org.example.object.Browserdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TargetCrawlPage {
    WebDriver driver = Browserdriver.driver;


    public TargetCrawlPage() {}

    public void hoverSelectProject(){
        WebElement projectSelectButton = driver.findElement(TargetCrawlObject.projectSelectHover);

        // Create an instance of Actions class and hover over the account button
        Actions actions = new Actions(driver);
        actions.moveToElement(projectSelectButton).perform();
    }

    public void selectProject() {
        WebElement projectSelect = driver.findElement(TargetCrawlObject.projectSelect);
        projectSelect.click();
    }

    public void navigateToTargetCrawling() {
        driver.findElement(TargetCrawlObject.targetCrawlPage).click();
    }

    public void clickAddTargetCrawlButton() {
        driver.findElement(TargetCrawlObject.addTargetCrawl).click();
    }

    public void setTargetCrawlName(String Uname) {
        driver.findElement(TargetCrawlObject.inputUname).sendKeys(Uname);
    }

    public void setSourceTargetCrawl() {
        driver.findElement(TargetCrawlObject.hoverSource).click();
        WebElement sourcetSelect = driver.findElement(TargetCrawlObject.selectTwitter);
        sourcetSelect.click();
    }

    public void setDate(String startdate, String enddate) {
        driver.findElement(TargetCrawlObject.inputStartDate).sendKeys(startdate);
        driver.findElement(TargetCrawlObject.inputEndDate).sendKeys(enddate);
    }
    public void clickSubmit() {
        driver.findElement(TargetCrawlObject.submitButton).click();
    }

    public void cilckSave() {
        driver.findElement(TargetCrawlObject.confirmCreate).click();
    }

    public void confirmCreate() {
        driver.findElement(TargetCrawlObject.notifyCreateSuccess);
    }

    public void clickDelete() {

    }

}
