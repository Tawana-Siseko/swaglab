package classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.io.IOException;


public class Tests {
    private WebDriver driver;
    Cart carts;
    LoginDetails loginDs;
    LoginPage loginP;
    Product products;
    Verify verifys;
    WebSite websites;

    private String username;
    private String password;

    public Tests(WebDriver driver){
        this.driver = driver;
    }
    @BeforeTest
    public void initialize(@Optional String browserName, @Optional String browseUrl) {
        browserName = "chrome";
        if (browserName != null && browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        } else if (browserName != null && browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testUnsuccessfulLogin() throws InterruptedException, IOException {
        loginP = new LoginPage(driver);
        websites = new WebSite(driver);


}
}
