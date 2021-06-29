package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.HoverToMyProfile;
import com.bridgelabz.pages.Login;
import org.testng.annotations.Test;

public class HoverToMyProfileTest extends Base {
    @Test
    public void loginToApplication() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
    @Test
    public void mouseHoverToSathwika() throws InterruptedException {
        HoverToMyProfile hover = new HoverToMyProfile(driver);
        hover.hoverToMyProfile();
    }



}
