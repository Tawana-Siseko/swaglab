package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("");
    private By error = By.xpath("");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username) {
        WebElement fNameElement = driver.findElement(userName);
        fNameElement.clear();
        driver.findElement(userName).sendKeys(username);
    }
    public void setPassword(String password) {
        WebElement fNameElement = driver.findElement(passwordField);
        fNameElement.clear();
        driver.findElement(passwordField).sendKeys(password);
    }
    public Verify clickLoginButton(){
        driver.findElement(loginButton).click();
        return new Verify(driver);
    }

}
