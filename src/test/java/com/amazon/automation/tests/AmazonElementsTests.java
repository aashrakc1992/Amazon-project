package com.amazon.automation.tests;

import com.amazon.automation.pages.AmazonHomePage;
import org.junit.Assert;
import org.junit.Test;

public class AmazonElementsTests {

    @Test
    public void testAmazonPage()  throws InterruptedException{
        AmazonHomePage homePage = new AmazonHomePage();
        homePage.loadHomePage();
        Thread. sleep(1000);
        homePage.searchBook();
        Thread. sleep(1000);
        homePage.clickItem();
        Thread. sleep(1000);
        String priceofItem = homePage.getPriceofItem();
        Thread. sleep(1000);
        Assert.assertEquals("$47.49", priceofItem.trim());
        Thread. sleep(1000);
        homePage.addToCart();
        Thread. sleep(1000);
        String priceOfCartItem = homePage.getCartTotalPrice();
        Thread. sleep(1000);
        Assert.assertEquals("$47.49", priceOfCartItem.trim());
        Thread. sleep(1000);
        homePage.proceedCheckOut();
    }
}
