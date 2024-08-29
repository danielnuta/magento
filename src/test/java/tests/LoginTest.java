package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){


        LoginPage loginPage = new LoginPage(driver);
      driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        loginPage.login("danielnuta91@gmail.com", "ABcd!@34");


        //Assert.assertTrue(driver.getTitle().contains("Login successful"));


    }
}
