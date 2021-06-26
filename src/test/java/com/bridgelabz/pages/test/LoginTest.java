package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.Logout;
import com.bridgelabz.pages.Search;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void loginToApplication() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
    @Test
    public static void logoutTheApplication() throws InterruptedException {
        Logout logout = new Logout(driver);
        logout.logoutTheApplication();
    }

}
