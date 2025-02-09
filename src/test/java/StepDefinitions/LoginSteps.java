package StepDefinitions;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject_Model.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid credentials")
    public void enterCredentials() {
        loginPage.login("yetondeshubham865@gmail.com", "Pass@12345");
    }

    @Then("I should be logged in successfully")
    public void verifyLogin() {
        String expUrl = "https://magento.softwaretestingboard.com/";
        String accUrl = driver.getCurrentUrl();
        Assert.assertEquals(accUrl,expUrl);
    }
}
