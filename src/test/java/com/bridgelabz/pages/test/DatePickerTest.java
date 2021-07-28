package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.DatePicker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends Base {
    @Test
    public static void date_picker() throws InterruptedException {
        DatePicker date = new DatePicker(driver);
        date.setDatePicker();
        date.getTripDetails();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com");
    }
}
