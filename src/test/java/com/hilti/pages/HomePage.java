package com.hilti.pages;

import com.hilti.utilities.ConfigurationReader;
import com.hilti.utilities.Countries;
import com.hilti.utilities.Driver;

public class HomePage extends BasePage{

    public String getUrlExtension(String country){

        String extension = "";
        switch (country){
            case "US":
                extension = Countries.US;
                break;
            case "DE":
                extension = Countries.DE;
                break;
            case "RU":
                extension = Countries.RU;
                break;
            case "JP":
                extension = Countries.JP;
                break;
            case "CN":
                extension = Countries.CN;
                break;
        }

        return extension;
    }

    public void openURL(String country){
        String url = ConfigurationReader.get("base_url") + getUrlExtension(country);
        System.out.println("URL = " + url);
        Driver.get().get(url);
    }
}
