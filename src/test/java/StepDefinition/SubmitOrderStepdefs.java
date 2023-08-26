package StepDefinition;

import POM.CheckoutPage;
import POM.OrderSubmissionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.UserLoginStepdefs.driver;

public class SubmitOrderStepdefs {
    OrderSubmissionPage elements;
    SoftAssert softAssert;

    @Given("User wants to submit the order")
    public void userWantsToSubmitTheOrder() {
        System.out.println("User wants to submit the order");
    }

    @When("User clicks on the place order button")
    public void userClicksOnThePlaceOrderButton() throws InterruptedException {
        elements = new OrderSubmissionPage(driver);
        softAssert = new SoftAssert();
        elements.placeOrderBttnClick();
    }

    @Then("Order submission journey completes")
    public void orderSubmissionJourneyCompletes() throws InterruptedException {
        String expectedBttnText = "Thank you for your purchase!";
        String actualBttnText = elements.getconfirmMessage();
        //soft assert to check order confirm message
        softAssert.assertTrue(actualBttnText.contains(expectedBttnText), "Partial text assertion failed.");
        System.out.println("User completes order submission journey");
    }

    @And("Sign out from the site and close the browser")
    public void signOutFromTheSiteAndCloseTheBrowser() throws InterruptedException {
        elements.signoutBttnClick();
    }
}
