package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddToCartPage {
    WebDriver driver;
    WebDriverWait wait;

    By productLink = By.xpath("//a[contains(text(), 'Montana')]");
    By addToCartButton = By.id("product-addtocart-button");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void clickOnProduct() {
        try {
            WebElement productElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productLink));
            System.out.println("Product element found: " + productElement.getText()); // Debugging
            productElement.click();
        } catch (Exception e) {
            System.out.println("Error clicking on product: " + e.getMessage());
        }
    }

    // Clicks on the "Add to Cart" button
    public void addToCart() {
        try {
            WebElement addToCartButtonElement = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
            System.out.println("Add to Cart Button found: " + addToCartButtonElement.getText()); // Debugging
            addToCartButtonElement.click();
        } catch (Exception e) {
            System.out.println("Error clicking 'Add to Cart': " + e.getMessage());
        }


    }
}
