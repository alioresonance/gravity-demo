package demo.pageobjects.model;

import lombok.Data;

@Data
public class User {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Boolean emailMeNews;
}