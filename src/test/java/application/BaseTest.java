package application;

import classes.LoginPage;
import classes.WebSite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver driver;
    public static WebSite webSite;
    protected static ExtentReports extent;
    protected static ExtentTest test;
    @BeforeTest
    public void setUp() {
        System.setProperty("web-driver.chrome","resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(" https://www.saucedemo.com");

        webSite = new WebSite(driver);
}
}
