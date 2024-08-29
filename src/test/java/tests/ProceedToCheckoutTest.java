package tests;

import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.SearchProductPage;
import pages.ProceedToCheckoutPage;

public class ProceedToCheckoutTest extends BaseTest{
    @Test
    public void testProceedToCheckout() {

        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.searchProduct("montana");

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.clickOnProduct();
        addToCartPage.addToCart();

        ProceedToCheckoutPage proceedToCheckoutPage = new ProceedToCheckoutPage(driver);
        proceedToCheckoutPage.proceedToCheckout();


        proceedToCheckoutPage.fillBillingInformation(
                "AAA", "CCC", "1 Mai", "Bucuresti", "București", "011376", "Romania", "0722 100 200"
        );

        proceedToCheckoutPage.selectShippingMethod();

        proceedToCheckoutPage.placeOrder();
    }
}
