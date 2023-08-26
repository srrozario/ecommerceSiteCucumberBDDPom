package StepDefinition;

import POM.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.UserLoginStepdefs.driver;

public class AddToCartStepdefs {
    ProductDetailsPage elements;
    SoftAssert softAssert;

    @Given("User wants to add to cart a specific product")
    public void userWantsToAddToCartASpecificProduct() {
        System.out.println("User wants to add to cart a specific product");
    }

    @When("User scroll down to the add to cart button")
    public void userScrollDownToTheAddToCartButton() throws InterruptedException {
        elements = new ProductDetailsPage(driver);
        softAssert = new SoftAssert();
        elements.scrollToElement();
    }

    @And("User selects color and size")
    public void userSelectsColorAndSize() {
        elements.productColorSizeSelection();
    }

    @And("User clicks on the add to cart button")
    public void userClicksOnTheAddToCartButton() throws InterruptedException {
        elements.addToCart();
    }

    @And("User scroll up to top")
    public void userScrollUpToTop() {
        elements.scrollToTop();
    }

    @And("User clicks on the proceed to checkout button")
    public void userClicksOnTheProceedToCheckoutButton() throws InterruptedException {
        elements.goToCheckout();
    }

    @Then("User navigates to the checkout page")
    public void userNavigatesToTheCheckoutPage()  {
        //soft assert to check page title
        softAssert.assertTrue(driver.getTitle().contains("Checkout"), "Page title is incorrect");
        System.out.println("User navigates to the checkout page");
    }
}
