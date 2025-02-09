package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject_Model.CheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckoutSteps {
    WebDriver driver;
    CheckoutPage checkoutPage;

    @Given("I proceed to checkout")
    public void proceedToCheckout() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/checkout");
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckout();
    }

    @Then("I should see available payment options")
    public void verifyPaymentOptions() {
        boolean isAvailable = checkoutPage.isPaymentMethodAvailable();
        assert(isAvailable);  // Assert the payment option are visible
    }
}
