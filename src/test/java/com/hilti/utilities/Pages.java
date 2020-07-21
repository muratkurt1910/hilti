package com.hilti.utilities;

import com.hilti.pages.FirestopSubmittalGenerator;
import com.hilti.pages.HomePage;
import com.hilti.pages.Products;

public class Pages {

    private HomePage homePage;
    private Products products;
    private FirestopSubmittalGenerator firestopSubmittalGenerator;

    public Pages(){
        this.homePage = new HomePage();
        this.products = new Products();
        this.firestopSubmittalGenerator = new FirestopSubmittalGenerator();
    }

    public HomePage homePage(){return homePage;}
    public Products products(){return products;}
    public FirestopSubmittalGenerator firestopSubmittalGenerator(){return firestopSubmittalGenerator;}
}
