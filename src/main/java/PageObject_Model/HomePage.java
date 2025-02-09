package PageObject_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //  search bar xpath
    By searchBar = By.xpath("//input[@id='search']");

    // Locator for a product 
    By productLink = By.xpath("//img[@alt='Balboa Persistence Tee']");

    //  enter text in the search bar
    public void enterSearchText(String searchQuery) {
        driver.findElement(searchBar).sendKeys(searchQuery);
    }

    // submit search
    public void submitSearch() {
        driver.findElement(searchBar).submit();
    }

    //  navigate to a product
    public void navigateToProduct() {
        driver.findElement(productLink).click();
        // Size
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-170']")).click();
        
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-53']"));
        
    }

	public void searchProduct(String string) {
		
		
	}
}

