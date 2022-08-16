package com.fva.app.tasks;

import com.fva.app.models.User;
import com.fva.app.pageobjects.SignUpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSingUp {

    @Autowired
    private SignUpServices signUp;

    public void withInfo(User user){

        signUp.writeFirstName(user.getFirstName());

        signUp.writeLastName(user.getLastName());

        signUp.writeEmailAdress(user.getEmail());

        //signUp.writeCountry("India");
        signUp.writePhone(user.getComments());
        //signUp.clickOnSubmit();



    }
}
