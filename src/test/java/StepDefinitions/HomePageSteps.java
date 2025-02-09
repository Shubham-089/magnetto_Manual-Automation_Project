package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject_Model.HomePage;

public class HomePageSteps {
    WebDriver driver;
    HomePage homePage;

    @Given("I navigate to the homepage")
    public void navigateToHomePage() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @When("I search for a product {string}")
    public void searchForProduct(String product) {
        homePage.enterSearchText(product);
        homePage.submitSearch();
    }

    @When("I click on a product")
    public void clickOnProduct() {
        homePage.navigateToProduct();
    }

    @Then("I should see the product details")
    public void verifyProductDetails() {
        
    	String tittle = driver.getTitle();
    	String exptittle = "Balboa Persistence Tee";
    	Assert.assertEquals(tittle, exptittle);
    }
}
