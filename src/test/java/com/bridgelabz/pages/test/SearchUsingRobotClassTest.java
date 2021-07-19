package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPageUsingRobotClass;
import com.bridgelabz.pages.SearchUsingRobotClass;
import org.testng.annotations.Test;
import java.awt.*;

public class SearchUsingRobotClassTest extends Base {
    @Test(priority = 1)
    public static void loginUsingRobotClass() throws InterruptedException, AWTException {
        LoginPageUsingRobotClass login = new LoginPageUsingRobotClass(driver);
        login.loginPage();

    }
    @Test(priority = 2)
    public void searchUsingRobotClass() throws AWTException, InterruptedException {
        SearchUsingRobotClass search = new SearchUsingRobotClass(driver);
        search.search();
    }
}
