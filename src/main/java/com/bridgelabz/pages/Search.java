package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Base {
    //@FindBy is used to find the elements using locators
    //Enter the xpath of the element
    @FindBy(xpath = "//input[@class = '_3704LK']")
    public static WebElement search;
    @FindBy(xpath = "//span[@class = 'r85cly']")
    public static WebElement mobiles;
    @FindBy(xpath = "//div[text() = 'realme C21 (Cross Blue, 32 GB)']")
    public static WebElement realmeC21;

    //Generate the constructor
    public Search(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
    //Give the sendKeys as the name of the element which we wanted to search
    public static void search() throws InterruptedException {
        search.sendKeys("mobiles");
        Thread.sleep(3000);
        mobiles.click();
        Thread.sleep(2000);

        //JavascriptExecutor here is used to scroll the window
        //window is scrolled downwards by 1000 pixel
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);

        //Action class is used here to navigate toward the element
        //click() method is used to click on to the particular navigated element
        Actions action = new Actions(driver);
        action.moveToElement(realmeC21).click().perform();
        Thread.sleep(2000);

    }
}
