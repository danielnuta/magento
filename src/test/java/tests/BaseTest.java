package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    //protected LoginPage;
    protected WebDriver driver;
    Properties properties = new Properties();

    @BeforeMethod
    public void setUp() throws IOException {
        WebDriverManager.firefoxdriver().setup();
    //WebDriverManager.chromedriver().setup();
    //driver = new ChromeDriver();
    driver = new FirefoxDriver();
        FileInputStream fileInputStream = new FileInputStream("src/test/java/utils/environment.properties");
        properties.load(fileInputStream);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get(properties.getProperty("url"));


}

    @AfterMethod
    public void tearDown(){
        if (driver !=null){
            driver.quit();
    }
}

}