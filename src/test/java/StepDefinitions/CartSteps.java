package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject_Model.CartPage;
import PageObject_Model.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CartSteps {
    WebDriver driver;
    HomePage homePage;
    CartPage cartPage;

    @Given("I navigate to the product page")
    public void navigateToProductPage() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);
    }

    @When("I add the product to the cart")
    public void addProductToCart() {
        homePage.searchProduct("T-shirt");
        cartPage = new CartPage(driver);
        cartPage.addToCart();
    }

    @Then("I should see the product in my cart")
    public void verifyProductInCart() {
        // verifying the cart item
    }
}
