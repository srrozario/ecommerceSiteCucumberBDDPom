package StepDefinition;

import POM.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

import static StepDefinition.UserLoginStepdefs.driver;

public class CheckoutStepdefs {
    CheckoutPage elements;
    SoftAssert softAssert;
    @Given("User wants to checkout the product")
    public void userWantsToCheckoutTheProduct() {
        System.out.println("User wants to checkout the product");
            }

    @When("User scroll down to next button")
    public void userScrollDownToNextButton() {
        elements = new CheckoutPage(driver);
        softAssert = new SoftAssert();
        elements.scrollDownToNextBttn();
    }

    @And("User clicks on the next button")
    public void userClicksOnTheNextButton() throws InterruptedException {
      elements.nextBttnClick();
    }

    @Then("User navigates to the order confirmation page")
    public void userNavigatesToTheOrderConfirmationPage() throws InterruptedException {
        String expectedBttnText = "Place Order";
        String actualBttnText = elements.getBttnText();
        //soft assert to check place order button text
        softAssert.assertTrue(actualBttnText.contains(expectedBttnText), "Partial text assertion failed.");
        System.out.println("User navigates to the order confirmation page");
    }
}
