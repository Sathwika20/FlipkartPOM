package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.CaptureScreenShot;
import org.testng.annotations.Test;

import java.io.IOException;

public class CaptureScreenShotTest extends Base {
    @Test
    public void captureScreenShotOfLoginPage() throws IOException {
        CaptureScreenShot captureScreenShot = new CaptureScreenShot(driver);
        captureScreenShot.captureScreenShot();
    }
}
