package com.hilti.pages;

import com.hilti.utilities.BrowserUtils;
import com.hilti.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FirestopSubmittalGenerator extends BasePage{

    @FindBy(xpath = "//*[text()='Add more systems']")
    public WebElement addMoreSystems;

    @FindBy(xpath = "//*[text()='Create submittal']")
    public WebElement createSubmittal;

    @FindBy(css = "input.js-firestop-checkbox")
    public List<WebElement> firestopSystems;

    public void selectFirestopSystems(){
        //List<WebElement> firestopSystems = Driver.get().findElements(By.cssSelector());

        Random random = new Random();
        int index1 = random.nextInt(firestopSystems.size());
        int index2 = random.nextInt(firestopSystems.size());
        int index3 = random.nextInt(firestopSystems.size());
        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        System.out.println("index3 = " + index3);

        BrowserUtils.clickWithJS(firestopSystems.get(index1));
        BrowserUtils.clickWithJS(firestopSystems.get(index2));
        BrowserUtils.clickWithJS(firestopSystems.get(index3));

    }

    @FindBy(xpath = "//input[starts-with(@name,'related')]")
    public List<WebElement> firestopProducts;

    public void deselectFirestopProducts(){
        //List<WebElement> firestopProducts = Driver.get().findElements(By.xpath("//input[starts-with(@name,'related')]"));

        Random random = new Random();
        int index = random.nextInt(firestopProducts.size());

        BrowserUtils.clickWithJS(firestopProducts.get(index));
    }

    @FindBy(xpath = "//*[@for='noCover']")
    public WebElement noCoverPage;

    @FindBy(xpath = "//*[@for='page-numbers-no']")
    public WebElement pageNumberNO;

    @FindBy(id = "create-submittal")
    public WebElement generateSubmittal;

    @FindBy(xpath = "//*[text()='Your submittal was built successfully']")
    public WebElement yourSubmittalWasBuiltSuccesfully;

    @FindBy(id = "download-link")
    public WebElement downloadSubmittal;

    public boolean isFileDownloaded() {
        BrowserUtils.waitFor(10);

        String downloadPath = "C:\\Users\\" + System.getenv("USERNAME")+ "\\Downloads";
        System.out.println("downloadPath = " + downloadPath);
        String fileName = "firestop.pdf";

        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

}
