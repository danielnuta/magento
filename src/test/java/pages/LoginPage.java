package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

//    public LoginPage(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }


    @FindBy(id = "email")
public WebElement emailTextField;

    @FindBy(id = "pass")
public WebElement passTextField;

    @FindBy(id = "send2")
public WebElement loginButton;


public LoginPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public void login(String email, String password){
    emailTextField.sendKeys(email);
    passTextField.sendKeys(password);
    loginButton.click();
}


}
