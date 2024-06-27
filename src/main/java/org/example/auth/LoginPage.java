package org.example.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {}

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginForm(String username, String password) {
        driver.findElement(AuthObject.email).sendKeys(username);
        driver.findElement(AuthObject.password).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(AuthObject.btnLogin).click();
    }

    public Boolean getHeader(){
        String dashboardHeader = "Please create or select a project first."; // Replace with the actual dashboard URL
        String actualDashboardHeader = driver.findElement(AuthObject.dashboardHeader).getText();
        return actualDashboardHeader.equals(dashboardHeader);
    }

}
