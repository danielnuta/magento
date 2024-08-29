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


    }
}
