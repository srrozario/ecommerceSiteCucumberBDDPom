package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags ="@login or @itemSelection or @addToCart or @orderConfirm or @submitOrder" , features = {"src/test/resources/Feature/TC_001_Login.feature","src/test/resources/Feature/TC_002_SelectProduct.feature","src/test/resources/Feature/TC_003_AddToCartProduct.feature","src/test/resources/Feature/TC_004_CheckoutProduct.feature","src/test/resources/Feature/TC_005_SubmitOrder.feature"},
        glue = {"StepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/featureReport.html"
        })
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
}