package com.hilti.pages;

import com.hilti.utilities.BrowserUtils;
import com.hilti.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//*[@href='#nav/products'])[1]")
    public WebElement products;

    public void navigateToProductsModule(){

        try {
            BrowserUtils.waitForClickablility(products, 5);
            new Actions(Driver.get()).moveToElement(products).pause(200).click().build().perform();
        }catch (Exception e){
            BrowserUtils.clickWithWait(products,5);
        }
    }


}
