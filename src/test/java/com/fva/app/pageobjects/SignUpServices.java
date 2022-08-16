package com.fva.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class SignUpServices {

    @Autowired
    private SignUpPageObject signUpPageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;
    
    
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
