package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.MouseHovering;
import com.bridgelabz.pages.MyProfile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyProfileTest extends Base {
    @Test
    public void loginToApplication() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
    @Test
    public void mouseHoverToSathwika() throws InterruptedException {
        MouseHovering mouseHovering = new MouseHovering(driver);
        mouseHovering.mouseHover();
    }
    @Test
    public static void setProfileInApplication() throws InterruptedException {
        MyProfile myProfile = new MyProfile(driver);
        myProfile.setMyProfile();




    }
}
