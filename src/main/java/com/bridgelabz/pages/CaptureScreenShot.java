package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot extends Base {
    @FindBy(xpath = "//input[@class = '_2IX_2- VJZDxU']")
    public static WebElement mobileNumber;

    public CaptureScreenShot(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public static void captureScreenShot() throws IOException {
        mobileNumber.sendKeys("7989216041");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./ScreenShots/FlipkartLogin.jpg"));
    }
}
