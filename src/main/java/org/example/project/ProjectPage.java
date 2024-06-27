package org.example.project;

import org.example.object.Browserdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ProjectPage {
    WebDriver driver = Browserdriver.driver;

    public ProjectPage() {}

    public void navigateToSidebar() {
        driver.findElement(ProjectObject.projectDropdown).click();
    }

    public void navigateProjectPage() {
        driver.findElement(ProjectObject.projectPage).click();
    }

    public void clickAddProject() {
        driver.findElement(ProjectObject.addProject).click();
    }

    public void setInputProject(String name, String desc) {
        driver.findElement(ProjectObject.inputName).sendKeys(name);
        driver.findElement(ProjectObject.inputDesc).sendKeys(desc);
    }

    public void clickSubmitProject() {
        driver.findElement(ProjectObject.submitProject).click();
    }

    public void clickDeleteProject(String projectName) {
        WebElement name = driver.findElement(By.xpath("//a[text()='" + projectName + "']/ancestor::div[@class='ant-card-head-title']"));
        name.findElement(ProjectObject.deleteProject).click();
    }

    public void modalDelete(){
        driver.findElement(ProjectObject.confirmDelete).click();
    }

    public void confirmDelete(){
        driver.findElement(ProjectObject.notifySuccess);
    }
}
