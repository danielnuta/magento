package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    WebDriver driver;


    By addToCartButton = By.id("product-addtocart-button");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();

//    By productLink = By.xpath("//a[contains(text(), 'Montana')]");
//    By addToCartButton = By.id("product-addtocart-button");
//
//    public AddToCartPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void clickOnProduct() {
//        driver.findElement(productLink).click();
//    }
//
//    public void addToCart() {
//        driver.findElement(addToCartButton).click();
    }
}
