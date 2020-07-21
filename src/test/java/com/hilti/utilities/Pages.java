package com.hilti.utilities;

import com.hilti.pages.HomePage;
import com.hilti.pages.Products;

public class Pages {

    private HomePage homePage;
    private Products products;

    public Pages(){
        this.homePage = new HomePage();
        this.products = new Products();
    }

    public HomePage homePage(){return homePage;}
    public Products products(){return products;}
}
