package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MouseHovering extends Base {

    @FindBy(xpath = "//div[text() = 'Sathwika']")
    public static WebElement sathwika;

    public MouseHovering(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public static void mouseHoverToSathwika() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(sathwika).build().perform();
        Thread.sleep(2000);


    }









}
