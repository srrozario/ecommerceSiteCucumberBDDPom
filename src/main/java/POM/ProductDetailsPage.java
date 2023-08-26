package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProductDetailsPage {
    WebDriver driver;

    By scrollElement = By.xpath("//div[@class='product-addto-links']//span[contains(text(),'Add to Wish List')]");
    By size = By.xpath("//div[@class='swatch-option text'][contains(.,'M')]");
    By color = By.xpath("//div[contains(@option-label,'Blue')]");
    By addToCartBttn = By.xpath("//button[@type='submit'][contains(.,'Add to Cart')]");
    By topAddToCartBttn = By.xpath("//a[@class='action showcart'][contains(.,'My Cart')]");
    By topCartCheckoutBttn = By.xpath("//button[@id='top-cart-btn-checkout']");

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void scrollToElement() throws InterruptedException {
        //Use java script executor to scroll to the element
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(scrollElement));


    }

    public void productColorSizeSelection() {
        driver.findElement(size).click();
        driver.findElement(color).click();

    }

    public void addToCart() throws InterruptedException {
        driver.findElement(addToCartBttn).click();
        Thread.sleep(1000);
    }

    public void scrollToTop() {
        //Use java script executor to scroll to the element
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(topAddToCartBttn));
    }

    public void goToCheckout() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(topAddToCartBttn).click();
        Thread.sleep(1000);
        driver.findElement(topCartCheckoutBttn).click();
        Thread.sleep(3000);
    }
}