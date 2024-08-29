package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){


      //  HomePage homePage = new HomePage(driver);
      //  homePage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        loginPage.login("danielnuta91@gmail.com", "ABcd!@34");

        Assert.assertTrue(driver.getTitle().contains("My Account"));
       // Assert.assertTrue("User logged in successfully");

//        LoginPage auth = PageFactory.initElements(driver, LoginPage.class);
//        driver.get(" hostname + "/customer/account/login/");

//
//                LoginPage auth = PageFactory.initElements(driver, LoginPage.class);

    }
}
