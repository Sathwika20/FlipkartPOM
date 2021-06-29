package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPageUsingRobotClass;
import com.bridgelabz.pages.SearchUsingRobotClass;
import org.testng.annotations.Test;

import java.awt.*;

public class SearchUsingRobotClassTest extends Base {
    @Test
    public static void loginUsingRobotClass() throws InterruptedException, AWTException {
        LoginPageUsingRobotClass login = new LoginPageUsingRobotClass(driver);
        login.loginPage();

    }
    @Test
    public void searchUsingRobotClass() throws AWTException, InterruptedException {
        SearchUsingRobotClass search = new SearchUsingRobotClass(driver);
        search.search();
    }
}
