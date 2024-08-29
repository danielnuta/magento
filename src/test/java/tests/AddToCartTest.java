package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddToCart(){
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("shirt");

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

    }
}
