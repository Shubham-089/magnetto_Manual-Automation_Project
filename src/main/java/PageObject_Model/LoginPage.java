package PageObject_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //  login slections
    By usernameField = By.xpath("//input[@id='email']");
    By passwordField = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
    By loginButton = By.xpath("//fieldset[@class='fieldset login']//div[@class='primary']");

    
    public WebElement getUsernameField() {
        return driver.findElement(usernameField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    //login 
    public void login(String username, String password) {
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
}
