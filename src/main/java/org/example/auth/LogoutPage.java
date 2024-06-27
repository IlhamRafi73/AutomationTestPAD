package org.example.auth;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogoutPage {
    WebDriver driver;

    public LogoutPage() {}

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverLogout() {
        WebElement accountButton = driver.findElement(AuthObject.btnAccount);

        // Create an instance of Actions class and hover over the account button
        Actions actions = new Actions(driver);
        actions.moveToElement(accountButton).perform();

    }

    public void clickLogout() {
        WebElement logoutButton = driver.findElement(AuthObject.btnLogout);
        logoutButton.click();;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}