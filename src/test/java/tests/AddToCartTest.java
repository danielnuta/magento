package tests;

import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.SearchProductPage;

public class AddToCartTest extends BaseTest{

    @Test
    public void testAddToCart(){

        driver.get("https://magento.softwaretestingboard.com/montana-wind-jacket.html");

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.addToCart();


    }
}
