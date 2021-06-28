package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile extends Base {
    @FindBy(xpath = "//div[text() = 'My Profile']")
    public static WebElement myProfile;

    public MyProfile(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public static void setMyProfile() throws InterruptedException {
        myProfile.click();
        Thread.sleep(2000);
    }

}
