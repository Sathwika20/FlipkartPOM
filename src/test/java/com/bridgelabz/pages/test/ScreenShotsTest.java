package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.listeners.CustomListeners;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners are implemented to listen all the listeners from Customlistener class
@Listeners(CustomListeners.class)
public class ScreenShotsTest extends Base {
    @Test
    public void takeScreenShotFailedTest1() {
        Assert.assertEquals(false,true);
    }
    @Test
    public void takeScreenShotFailedTest2() {
        Assert.assertEquals(false,true);
    }

}
