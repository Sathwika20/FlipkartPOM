package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchUsingRobotClass extends Base {
    //@FindBy is used to find the elements using locators
    //Enter the xpath of the element
    @FindBy(xpath = "//input[@class = '_3704LK']")
    public static WebElement search;
    @FindBy(xpath = "//div[@class = '_1HeMA2']")
    public static WebElement plants;
    @FindBy(xpath = "//a[@class = 's1Q9rs']")
    public static WebElement twoLayerBambooPlant ;

    //Generate the constructor
    public SearchUsingRobotClass(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
    //Give the sendKeys as the name of the element which we wanted to search
    public static void search() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Thread.sleep(2000);
        search.sendKeys("Plants");
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}

