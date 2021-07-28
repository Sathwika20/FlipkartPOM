package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.HoverToMyProfile;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.Search;
import org.testng.annotations.Test;

public class FlipkartTest extends Base {
    @Test(priority = 1)
    public void loginToApplication() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
    @Test(priority = 2)
    public void searchInApplication() throws InterruptedException {
        Search search = new Search(driver);
        search.search();
    }
    @Test(priority = 3)
    public void mouseHoverToSathwika() throws InterruptedException {
        HoverToMyProfile hover = new HoverToMyProfile(driver);
        hover.hoverToMyProfile();

    }



}
