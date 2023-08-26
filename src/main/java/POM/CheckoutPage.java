package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;

    By nextBttn = By.xpath("//button[@class='button action continue primary'][contains(.,'Next')]");
    By placeOrderBttn = By.xpath("//button[@title='Place Order']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void scrollDownToNextBttn() {
        //Use java script executor to scroll to the element
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(nextBttn));
    }

    public void nextBttnClick() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(nextBttn).click();
    }

    public String getBttnText() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(placeOrderBttn).getText();
    }
}
