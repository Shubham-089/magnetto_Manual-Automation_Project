package PageObject_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	 WebDriver driver;

	    // Locators
	    By firstName = By.id("firstname");
	    By lastName = By.id("lastname");
	    By email = By.id("email_address");
	    By password = By.id("password");
	    By confirmPassword = By.id("password-confirmation");
	    By createAccountButton = By.xpath("//button[@title='Create an Account']");

	    // Constructor
	    public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods to interact with elements
	    public void enterFirstName(String fName) {
	        driver.findElement(firstName).sendKeys(fName);
	    }

	    public void enterLastName(String lName) {
	        driver.findElement(lastName).sendKeys(lName);
	    }

	    public void enterEmail(String emailAddress) {
	        driver.findElement(email).sendKeys(emailAddress);
	    }

	    public void enterPassword(String pwd) {
	        driver.findElement(password).sendKeys(pwd);
	    }

	    public void enterConfirmPassword(String pwd) {
	        driver.findElement(confirmPassword).sendKeys(pwd);
	    }

	    public void clickCreateAccount() {
	        driver.findElement(createAccountButton).click();
	    }
	}
