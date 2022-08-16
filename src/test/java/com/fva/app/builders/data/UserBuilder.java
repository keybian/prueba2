package com.fva.app.builders.data;

import com.fva.app.models.User;

public class UserBuilder {

    private User user;



    public static UserBuilder anUser(){
        return new UserBuilder();
    }

    public UserBuilder defaultInfo(){
        this.user = User.builder()
                .firstName("Keybian")
                .lastName("Padilla")
                .email("padilla@keybian.com")
                .comments("muchas gracias")
                .build();
        return this;
    }

    public UserBuilder withoutEmail(){
        user.setEmail("");
        return  this;
    }

    public User build(){
        return this.user;
    }
}
