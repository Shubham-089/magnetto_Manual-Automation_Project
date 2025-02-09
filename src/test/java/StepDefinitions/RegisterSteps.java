package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject_Model.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	WebDriver driver;
    RegisterPage registerPage;

    @Given("User is on the registration page")
    public void user_is_on_registration_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        registerPage = new RegisterPage(driver);
        
    }

    @When("User enters first name")
    public void user_enters_first_name(String firstName) {
        registerPage.enterFirstName(firstName);
        
    }

    @When("User enters last name")
    public void user_enters_last_name(String lastName) {
        registerPage.enterLastName(lastName);
        
    }

    @When("User enters email")
    public void user_enters_email(String email) {
        registerPage.enterEmail(email);
        
    }

    @When("User enters password")
    public void user_enters_password(String password) {
        registerPage.enterPassword(password);
        
    }

    @When("User enters confirm password")
    public void user_enters_confirm_password(String confirmPassword) {
        registerPage.enterConfirmPassword(confirmPassword);
        
    }

    @When("User clicks on create account button")
    public void user_clicks_create_account_button() {
        registerPage.clickCreateAccount();
        
    }

    @Then("User should be registered successfully")
    public void user_registered_successfully() {
        
    }
    
}
