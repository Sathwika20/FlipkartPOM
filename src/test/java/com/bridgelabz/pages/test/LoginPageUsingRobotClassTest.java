package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPageUsingRobotClass;
import org.testng.annotations.Test;

import java.awt.*;

public class LoginPageUsingRobotClassTest extends Base {
    @Test
    public static void loginUsingRobotClass() throws InterruptedException, AWTException {
        LoginPageUsingRobotClass login = new LoginPageUsingRobotClass(driver);
        login.loginPage();

    }
}
