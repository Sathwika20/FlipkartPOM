package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import org.testng.annotations.Test;

public class MouseHoveringTest extends Base {
    @Test
    public void loginToApplication() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
    @Test
    public void mouseHoverToSathwika() throws InterruptedException {
        MouseHoveringTest mouseHoveringTest = new MouseHoveringTest();
        mouseHoveringTest.mouseHoverToSathwika();
        Thread.sleep(2000);


    }
}
