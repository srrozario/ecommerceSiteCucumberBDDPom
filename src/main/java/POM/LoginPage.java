package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;

    By loginBtn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    By emailEl = By.id("email");
    By passwordEl = By.id("pass");
    By signBtn = By.id("send2");
    By welcomeMessage = By.xpath("(//span[@class='logged-in'][contains(.,'Welcome, Sajib Rozario!')])[1]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void loginBtnClick() {
        driver.findElement(loginBtn).click();
    }

    public void formFillUp(String email, String password) {
        driver.findElement(emailEl).sendKeys(email);
        driver.findElement(passwordEl).sendKeys(password);
    }

    public void signBtn() {
        driver.findElement(signBtn).click();
    }

    public String setWelcomeMessage() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(welcomeMessage).getText();

    }


}
