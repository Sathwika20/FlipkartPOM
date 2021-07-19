package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    public static WebDriver driver;

    //Before execution
    @BeforeTest
    public void setUp() {
        //launches the chromedriver using Webdriver interface
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Used to maximise the window
        driver.manage().window().maximize();
        //Enter the URL of Application
        driver.get("https://www.flipkart.com/");


    }
    //After execution
    @AfterTest
    public void tearDown() {
    //used to close the current window
        driver.close();

    }


}
