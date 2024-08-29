package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/customer/account/login/']")
    WebElement signInLink;

    @FindBy(id = "search")
    WebElement searchInput;

    @FindBy(xpath = "//button[@title='Search']")
    WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {
        signInLink.click();
    }

    public void searchProduct(String productName) {
        searchInput.sendKeys(productName);
        searchButton.click();
    }
}
