package com.hilti.step_definitions;

import com.hilti.utilities.Pages;
import io.cucumber.java.en.*;

public class CategoryNameStepDefinitions {

    Pages pages = new Pages();

    @Given("User opens Hilti website for country {string}")
    public void user_opens_Hilti_website_for_country(String country) {
        pages.homePage().openURL(country);
    }

    @When("User expands products navigation")
    public void user_expands_products_navigation() {
        pages.homePage().navigateToProductsModule();
    }

    @Then("User verifies category {string} is present on the products navigation")
    public void user_verifies_category_is_present_on_the_products_navigation(String categoryName) {
        pages.products().verifyCategoryNameIsDisplayed(categoryName);
    }
}
