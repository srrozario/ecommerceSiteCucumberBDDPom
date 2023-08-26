package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ProductCategoryPage {
    WebDriver driver;
    Actions actions;

    By menMainMenu = By.xpath("//span[contains(text(),'Men')]");
    By topsSubMenu = By.xpath("//a[@id='ui-id-17']//span[contains(text(),'Tops')]");
    By jacketMenuItem = By.xpath("//a[@id='ui-id-19']//span[contains(text(),'Jackets')]");
    By productSelect = By.xpath("//a[@class='product photo product-item-photo']//img[@alt='Proteus Fitness Jackshirt']");
//    By itemSize = By.xpath("//div[@class='swatch-opt-430']//div[@id='option-label-size-143-item-166']");
//    By itemColor = By.xpath("//div[@class='swatch-opt-430']//div[@id='option-label-color-93-item-49']");

    public ProductCategoryPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void selectCategory() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(menMainMenu)).build().perform();
        Thread.sleep(1000);
        // Perform hover over the "Sub" menu
        actions.moveToElement(driver.findElement(topsSubMenu)).build().perform();
        Thread.sleep(1000);
        driver.findElement(jacketMenuItem).click();
    }

    public void selectProduct() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(productSelect).click();
        Thread.sleep(2000);
    }
}
