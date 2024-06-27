package org.example.project;

import org.openqa.selenium.By;

public class ProjectObject {

    public ProjectObject() {}

    public static final By projectDropdown = By.xpath("//*[@id=\"app\"]/div/div[1]/div/aside/div/ul/li[1]/ul/li/div");
    public static final By projectPage = By.xpath("//a[@href='http://10.33.35.38:8000/admin/project']");
    public static final By addProject = By.xpath("//*[@id=\"app\"]/div/div[2]/main/div/div[1]/button");
    public static final By submitProject = By.xpath("//*[@id=\"app\"]/div/div[2]/main/div/div[2]/form/div[3]/div/div/div/div/div/div[1]/button");
    public static final By deleteProject = By.xpath("//*[@id=\"app\"]/div/div[2]/main/div/div[4]/div/div[1]/div/div[2]/button");
    public static final By inputName = By.xpath("//*[@id=\"name\"]");
    public static final By inputDesc = By.xpath("//*[@id=\"description\"]");
    public static final By confirmDelete = By.xpath("//button[contains(.,'Delete')]");
    public static final By notifySuccess = By.xpath("//div[@class='ant-notification-notice-message' and contains(text(), 'Project deleted successfully')]") ;
}
