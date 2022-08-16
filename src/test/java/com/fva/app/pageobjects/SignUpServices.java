package com.fva.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {
    @Autowired
    private WebDriver driver;
    @Autowired
    private SignUpPageObject signUpPageObject;




    public void go(String url){
        this.driver.get(url);
    }

    public void writeFirstName(String firstname){

        this.signUpPageObject.getFirsNameTextbox().sendKeys(firstname);
    }

    public void writeLastName(String lastname){

        this.signUpPageObject.getLastName().sendKeys(lastname);
    }

    public void writeEmailAdress(String emailadress){
        this.signUpPageObject.getEmailAdress().sendKeys(emailadress);
    }

    public void writePhone(String comments){
        this.signUpPageObject.getComments().sendKeys(comments);
    }


    public void clickOnSubmit(){

        this.signUpPageObject.getSubmit().click();
    }

}
