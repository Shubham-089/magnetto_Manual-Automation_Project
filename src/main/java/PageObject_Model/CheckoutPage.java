package PageObject_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // checkout button xpath
    By checkoutButton = By.xpath("//button[@id='top-cart-btn-checkout']");

    //  go to checkout option
    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }

    //  payment className 
    By paymentMethodOptions = By.className("payment-method");

    // verify available payment methods
    public boolean isPaymentMethodAvailable() {
        return driver.findElements(paymentMethodOptions).size() > 0;
    }
}
