package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Base {
    @FindBy(xpath = "//input[@class = '_3704LK']")
    public static WebElement search;

    public Search(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public static void search() throws InterruptedException {
        search.sendKeys("mobiles");
        Thread.sleep(5000);

    }
}
