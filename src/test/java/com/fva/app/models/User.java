package com.fva.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String comments;

}
