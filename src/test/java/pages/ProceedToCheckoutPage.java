package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckoutPage {
    WebDriver driver;

    // Locators for checkout process
    By cartIcon = By.xpath("//a[@class='action showcart']");
    By proceedToCheckoutButton = By.id("top-cart-btn-checkout");

    // Billing and Shipping Information locators (simplified, may need adjustments)
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By streetAddressField = By.name("street[0]");
    By cityField = By.name("city");
    By stateDropdown = By.name("region_id");
    By postalCodeField = By.name("postcode");
    By countryDropdown = By.name("country_id");
    By phoneNumberField = By.name("telephone");
    By continueToShippingButton = By.xpath("//button[@class='button action continue primary']");

    // Shipping method selection
    By shippingMethodRadio = By.xpath("//input[@name='ko_unique_1']"); // Adjust the name attribute based on actual value
    By nextButton = By.xpath("//button[@class='button action continue primary']");

    // Place Order Button
    By placeOrderButton = By.xpath("//button[@title='Place Order']");

    public ProceedToCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(cartIcon).click();
        driver.findElement(proceedToCheckoutButton).click();
    }

    public void fillBillingInformation(String firstName, String lastName, String street, String city, String state, String postalCode, String country, String phoneNumber) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(streetAddressField).sendKeys(street);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateDropdown).sendKeys(state);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(countryDropdown).sendKeys(country);
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        driver.findElement(continueToShippingButton).click();
    }

    public void selectShippingMethod() {
        driver.findElement(shippingMethodRadio).click();
        driver.findElement(nextButton).click();
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }
}
