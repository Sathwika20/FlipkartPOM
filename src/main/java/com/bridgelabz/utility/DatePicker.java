package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePicker extends Base {
    @FindBy(xpath = "//input[@class = '_2IX_2- VJZDxU']")
    public static WebElement mobileNumber;

    @FindBy(xpath = "//input[@class = '_2IX_2- _3mctLh VJZDxU']")
    public static WebElement password;

    @FindBy(xpath = "//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']")
    public static WebElement login;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[2]")
    public static WebElement travel;

    @FindBy(xpath = "//input[@class = '_1w3ZZo _2gKfhi _2mFmU7']")
    public static WebElement depart;

//    @FindBy(xpath = "//div[text() = '\"+month+\"']")
//    public static WebElement clickOnMonth;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[2]/tbody/tr[3]/td[6]/div/button")
    public static WebElement clickOnDate;

    public DatePicker(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public static void setDatePicker() throws InterruptedException {
        mobileNumber.sendKeys("7989216041");
        password.sendKeys("ABCdef123");
        login.click();
        Thread.sleep(3000);
        //used to hover onto the travel element
        Actions actions = new Actions(driver);
        actions.moveToElement(travel).click().build().perform();
        Thread.sleep(5000);
        depart.click();
        Thread.sleep(3000);
        //used to scroll the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
    }
    public static void getTripDetails() throws InterruptedException {
        String selectDate = "10/15/2021";
        Date d = new Date(selectDate);

        //formatting the date into the required format
        SimpleDateFormat dt = new SimpleDateFormat("MMMM/dd/yyyy");
        String date = dt.format(d);
        System.out.println(date);
        //splitting the date by expression "/"
        String[] split = date.split("/");
        System.out.println(split[0]+" "+split[1]+" "+split[2]);
        String month = split[0]+" "+split[2];
        System.out.println(month);
        Thread.sleep(2000);
        while (true){
            try{
                driver.findElement(By.xpath("//div[text() = '"+month+"']")).isDisplayed();
                clickOnDate.click();
                Thread.sleep(3000);
                break;
            }
            catch (Exception e){
                driver.findElement(By.xpath("//div[@class = '_3hsbax']")).click();
                Thread.sleep(5000);


            }
        }
    }

}
