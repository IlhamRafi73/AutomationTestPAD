package org.example.auth;

import org.openqa.selenium.By;

public class AuthObject {

    public AuthObject() {}

    public final static By email = By.xpath("//*[@id=\"email\"]");
    public final static By password = By.xpath("//*[@id=\"password\"]");
    public final static By btnLogin = By.xpath("//*[@id=\"login_btn\"]");
    public final static By dashboardHeader = By.xpath("//*[contains(text(),'Please create or select a project first.')]");
    public final static By btnLogout = By.xpath("/html/body/div[2]/div/ul/li");
    public final static By btnAccount = By.xpath("//*[@id=\"app\"]/div/div[1]/div/aside/div/button");
}
