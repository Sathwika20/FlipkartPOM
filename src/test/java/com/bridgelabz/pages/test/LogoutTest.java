package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Logout;
import org.testng.annotations.Test;

public class LogoutTest extends Base {
    @Test
    public static void logoutTheApplication() throws InterruptedException {
        Logout logout = new Logout(driver);
        logout.logoutTheApplication();
    }
}
