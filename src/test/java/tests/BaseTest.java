package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    //protected LoginPage;
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
    //WebDriverManager.chromedriver().setup();
    //driver = new ChromeDriver();
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get("https://magento.softwaretestingboard.com/");


}

    @AfterMethod
    public void tearDown(){
        if (driver !=null){
            driver.quit();
    }
}

}