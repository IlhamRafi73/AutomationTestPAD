package org.example.targetcrawl;

import org.openqa.selenium.By;

public class TargetCrawlObject {

    TargetCrawlObject(){}

    public static final By projectSelectHover = By.xpath("//*[@id=\"app\"]/div/div[2]/header/div/div[2]/div/div[1]/button");
    public static final By projectSelect = By.xpath("/html/body/div[2]/div/div/ul/li[1]");
    public static final By targetCrawlPage = By.xpath("//*[@id=\"app\"]/div/div[1]/div/aside/div/ul/li[5]") ;
    public static final By addTargetCrawl = By.xpath("//*[@id=\"app\"]/div/div[2]/main/div/div[1]/div/div[2]/div/div[2]/button") ;
    public static final By inputUname = By.xpath("//*[@id=\"name\"]");
    public static final By hoverSource = By.xpath("//*[@id=\"app\"]/div/div[2]/main/form/div/div[2]/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div") ;
    public static final By selectTwitter = By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]") ;
    public static final By inputStartDate = By.xpath("//div[@class='ant-picker-input ant-picker-input-active']//input[@id='date']") ;
    public static final By inputEndDate = By.xpath("//div[@class='ant-picker-input']//input[@placeholder='End date']") ;
    public static final By submitButton = By.xpath("//*[@id=\"app\"]/div/div[2]/main/form/div/div[2]/div/div/div[7]/div/div/div/div/div/div[1]/button") ;
    public static final By confirmCreate = By.xpath("//button[contains(.,'Save')]") ;
    public static final By confirmDelete = By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
    public static final By notifyCreateSuccess = By.xpath("//div[@class='ant-notification-notice-message' and contains(text(), 'Keyword created successfully')]");
    public static final By notifyDeleteSuccess = By.xpath("//div[@class='ant-notification-notice-message' and contains(text(), 'Keyword deleted successfully')]");


}
