package com.bridgelabz.pages.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Search;
import org.testng.annotations.Test;

public class SearchTest extends Base {
    @Test
    public void searchInApplication() throws InterruptedException {
        Search search = new Search(driver);
        search.search();
    }

}