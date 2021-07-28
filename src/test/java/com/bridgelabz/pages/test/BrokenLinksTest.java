package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.BrokenLinks;
import org.testng.annotations.Test;

public class BrokenLinksTest extends Base {
    @Test
    public static void getBrokenLinks(){
        BrokenLinks links = new BrokenLinks();
        links.getBrokenLinks();
        System.out.println(driver.getTitle());
    }
}
