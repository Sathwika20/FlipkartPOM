package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MouseHovering extends Base {

    //@FindBy is used to find the elements by using locators
    //xpath of the element to be hovered

    @FindBy(xpath = "//div[text() = 'Sathwika']")
    public static WebElement sathwika;

    //Generate a constructor
    public MouseHovering(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Actions class is used to hover on to the element
    public static void mouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(sathwika).build().perform();
        Thread.sleep(2000);
    }

}










