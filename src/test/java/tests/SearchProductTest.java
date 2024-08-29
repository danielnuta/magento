package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;

public class SearchProductTest extends BaseTest{
    @Test
    public void testSearchProduct(){
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.searchProduct("montana");

//        String expectedText = "montana";
//        boolean isProductDisplayed = driver.findElement(By.xpath("//*[contains(text(), 'montana')]")).isDisplayed();
//
//        Assert.assertTrue(isProductDisplayed,"'montana' was not found in the search results.");
    }
}
