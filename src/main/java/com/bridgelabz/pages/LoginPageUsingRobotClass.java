package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginPageUsingRobotClass extends Base {
    @FindBy(xpath = "//input[@class = '_2IX_2- VJZDxU']")
    public static WebElement mobileNumber;

    @FindBy(xpath = "//input[@class = '_2IX_2- _3mctLh VJZDxU']")
    public static WebElement password;

    //Generate a Constructor
    public LoginPageUsingRobotClass(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public static void loginPage() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Thread.sleep(2000);
        mobileNumber.sendKeys("7989216041");
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        password.sendKeys("ABCdef123");
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}




