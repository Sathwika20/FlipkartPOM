package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void loginToApplication() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
}
