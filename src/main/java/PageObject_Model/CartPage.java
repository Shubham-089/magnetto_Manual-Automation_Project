package PageObject_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //"Add to Cart" button
    By addToCartButton = By.xpath("//a[@class='action showcart']");

    // "Add to Cart" button
    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}

