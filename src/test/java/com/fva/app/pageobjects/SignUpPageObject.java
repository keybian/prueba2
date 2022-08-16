package com.fva.app.pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SignUpPageObject {


    @Autowired
    private WebDriver driver;

    @Autowired
    public SignUpPageObject(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(this.driver,this);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firsNameTextbox;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailAdress;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement comments;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    private WebElement submit;





}
