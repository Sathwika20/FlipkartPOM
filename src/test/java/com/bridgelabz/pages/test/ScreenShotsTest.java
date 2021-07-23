package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.listeners.CustomListeners;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners are implemented to listen all the listeners from Custom listener class
@Listeners(CustomListeners.class)
public class ScreenShotsTest extends Base {
    @Description("Screenshots are taken for failed test cases")
    @Test
    public void takeScreenShotFailedTest1() {

        Assert.assertEquals(false,true);
    }
    @Description("Screenshots are taken for failed test cases")
    @Test
    public void takeScreenShotFailedTest2() {

        Assert.assertEquals(false,true);
    }

}
