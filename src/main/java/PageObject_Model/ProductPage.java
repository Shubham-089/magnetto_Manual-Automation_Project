package PageObject_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //  "Add to Cart" button
    By addToCartButton = By.id("product-addtocart-button");

    //  product price 
    By productPrice = By.className("price");

    // click the "Add to Cart" button
    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
    }

    //  product price
    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }
}
