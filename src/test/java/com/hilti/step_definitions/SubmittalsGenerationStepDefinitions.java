package com.hilti.step_definitions;

import com.hilti.utilities.BrowserUtils;
import com.hilti.utilities.ConfigurationReader;
import com.hilti.utilities.Driver;
import com.hilti.utilities.Pages;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SubmittalsGenerationStepDefinitions {

    Pages pages = new Pages();

    @Given("User opens Hilti US website")
    public void user_opens_Hilti_US_website() {
        pages.homePage().openURL("US");
    }

    @When("User navigates to Firestop submittal generator page")
    public void user_navigates_to_Firestop_submittal_generator_page() {
        Driver.get().navigate().to(ConfigurationReader.get("firestops_url"));
    }

    @When("User starts submittal generation process")
    public void user_starts_submittal_generation_process() {
        BrowserUtils.clickWithJS(pages.firestopSubmittalGenerator().addMoreSystems);
    }

    @When("User selects Firestop systems: \\(choose three)")
    public void user_selects_Firestop_systems_choose_three() {
        pages.firestopSubmittalGenerator().selectFirestopSystems();
    }

    @When("User creates submittal")
    public void user_creates_submittal() {
        BrowserUtils.clickWithJS(pages.firestopSubmittalGenerator().createSubmittal);
    }

    @When("User deselects Firestop products: \\(choose one)")
    public void user_deselects_Firestop_products_choose_one() {
        pages.firestopSubmittalGenerator().deselectFirestopProducts();
    }

    @When("User selects submittals options: no cover page, do not include page numbers")
    public void user_selects_submittals_options_no_cover_page_do_not_include_page_numbers() {
        BrowserUtils.clickWithJS(pages.firestopSubmittalGenerator().noCoverPage);
        BrowserUtils.clickWithJS(pages.firestopSubmittalGenerator().pageNumberNO);
    }

    @When("User finalizes submittal generation process")
    public void user_finalizes_submittal_generation_process() {
        BrowserUtils.clickWithJS(pages.firestopSubmittalGenerator().generateSubmittal);
    }

    @Then("User can download the generated document")
    public void user_can_download_the_generated_document() {
        BrowserUtils.waitForVisibility(pages.firestopSubmittalGenerator().yourSubmittalWasBuiltSuccesfully, 10);
        BrowserUtils.clickWithWait(pages.firestopSubmittalGenerator().downloadSubmittal, 5);

        Assert.assertTrue(pages.firestopSubmittalGenerator().isFileDownloaded());
    }

}
