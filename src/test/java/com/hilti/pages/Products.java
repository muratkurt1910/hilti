package com.hilti.pages;

import com.hilti.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Products extends BasePage{

    public void verifyCategoryNameIsDisplayed(String categoryName) {

        String locator = "(//*[text()='"+ categoryName +"'])[1]";
        WebElement element = Driver.get().findElement(By.xpath(locator));

        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }
}
