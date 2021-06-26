package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {


    @FindBy(xpath = "//input[@class = '_2IX_2- VJZDxU']" )
    public static WebElement email;

    @FindBy(xpath = "//input[@class = '_2IX_2- _3mctLh VJZDxU']")
    public static WebElement password;

    @FindBy(xpath = "//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']")
    public static WebElement loginButton;

    public Login(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }


    public static void getUserName() throws InterruptedException {
        email.sendKeys("7989216041");
        password.sendKeys("ABCdef123");
        loginButton.click();
        Thread.sleep(2000);

    }



}
