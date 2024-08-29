package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchProductPage {
    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.id("search");
    By searchButton = By.xpath("//button[@title='Search']");

    public SearchProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void searchProduct(String productName) {
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        searchField.sendKeys(productName);

        WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButtonElement.click();

//    public void searchProduct(String productName) {
//        driver.findElement(searchBox).sendKeys(productName);
//        driver.findElement(searchButton).click();
    }
}
