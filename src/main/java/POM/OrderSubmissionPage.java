package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class OrderSubmissionPage {
    WebDriver driver;

    By placeOrderBttn = By.xpath("//button[@title='Place Order']");
    By confirmMessage = By.xpath("//span[@class='base'][contains(.,'Thank you for your purchase!')]");
    By dropdownBttn = By.xpath("//div[@class='panel header']//button[@type='button']");
    By signoutBttn = By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']");

    public OrderSubmissionPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void placeOrderBttnClick() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(placeOrderBttn).click();
    }

    public String getconfirmMessage() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(confirmMessage).getText();
    }

    public void signoutBttnClick() throws InterruptedException {
        driver.findElement(dropdownBttn).click();
        Thread.sleep(1000);
        driver.findElement(signoutBttn).click();
        Thread.sleep(1000);
        driver.close();
    }
}
