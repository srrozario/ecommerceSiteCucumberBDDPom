package StepDefinition;

import Core.Helper;
import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class UserLoginStepdefs {
    //create a static variable called driver
    public static WebDriver driver;
    LoginPage elements;
    SoftAssert softAssert;

    @Given("User lands on the login page")
    public void userLandsOnTheLoginPage() {
        Helper helper = new Helper();
        driver = helper.ChromeTest();
    }

    @When("Click on the sign-in button")
    public void clickOnTheSignInButton() {
        elements = new LoginPage(driver);
        softAssert = new SoftAssert();
        elements.loginBtnClick();
    }

    @And("Insert user {string} and {string}")
    public void insertUserEmailAndPassword(String email, String password) {
        elements.formFillUp(email, password);
    }

    @And("Clicks on the add customer button")
    public void clicksOnTheAddCustomerButton() {
        elements.signBtn();
    }

    @Then("Go to the next page")
    public void goToTheNextPage() throws InterruptedException {
        String expectedPartialText = "Welcome";
        String welcomeMessage = elements.setWelcomeMessage();
        //soft assert to check login welcome message text
        softAssert.assertTrue(welcomeMessage.contains(expectedPartialText), "Partial text assertion failed.");
        System.out.println("User will navigate to the next page");
    }
}
