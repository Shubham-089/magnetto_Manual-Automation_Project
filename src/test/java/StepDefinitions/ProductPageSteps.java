package StepDefinitions;



import org.openqa.selenium.WebDriver;

import PageObject_Model.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProductPageSteps {
    WebDriver driver;
    ProductPage productPage;

    @When("I add the product to the cart")
    public void addProductToCart() {
        productPage = new ProductPage(driver);
        productPage.addProductToCart();
    }

    @Then("I should see the product in my cart")
    public void verifyProductInCart() {
       
    }

    @Then("I should see the product price {string}")
    public void verifyProductPrice(String expectedPrice) {
        String actualPrice = productPage.getProductPrice();
        assert(actualPrice.equals(expectedPrice));  // Check that the prices match
    }
}
