package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HoverToMyProfile extends Base {

    //@FindBy is used to find the elements by using locators
    //xpath of the element to be hovered

    @FindBy(xpath = "//div[text() = 'Sathwika']")
    public static WebElement sathwika;
    @FindBy(xpath = "//div[text() = 'My Profile']")
    public static WebElement myProfilePage;

    //Generate a constructor
    public HoverToMyProfile(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Actions class is used to hover on to the element
    public static void hoverToMyProfile() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(sathwika).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(myProfilePage).click().perform();
        Thread.sleep(3000);
    }

}










