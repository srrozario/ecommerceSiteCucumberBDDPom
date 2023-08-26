package StepDefinition;

import POM.ProductCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static StepDefinition.UserLoginStepdefs.driver;

public class ProductSelectStepdefs {
    ProductCategoryPage elements;
    SoftAssert softAssert;
    @Given("User wants to navigate to a specific product details page")
    public void userWantsToNavigateToASpecificProductDetailsPage() {
        System.out.println("User wants to navigate to a specific product details page");
            }

    @When("User Select a specific product category")
    public void userSelectASpecificProductCategory() throws InterruptedException {
        elements = new ProductCategoryPage(driver);
        softAssert = new SoftAssert();
        elements.selectCategory();
    }

    @And("User clicks on a specific product")
    public void userClicksOnASpecificProduct() throws InterruptedException {
        elements.selectProduct();
    }

    @Then("Navigate to product details page")
    public void navigateToProductDetailsPage() {
        //soft assert to check page title
        softAssert.assertTrue(driver.getTitle().contains("Proteus Fitness Jackshirt"), "Products page title is incorrect.");
        System.out.println("User navigates to the selected product details page");
    }
}
