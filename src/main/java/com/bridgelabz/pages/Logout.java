package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends Base {

    @FindBy(xpath = "//div[@class = 'exehdJ']")
    public static WebElement sathwika;

    @FindBy(xpath = "//div[@class = '_3vhnxf']")
    public static WebElement logout;

    public Logout(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
    public static void logoutTheApplication() throws InterruptedException {
        sathwika.click();
        logout.click();
        Thread.sleep(3000);
    }
}
