package com.example.vichayan.APIModel;

public class UserModel {
    String contact;
    String dob;
    String email;
    String firstname;
    String lastname;
    String password;
    String password_confirmation;
    String response;
    String token;

    public UserModel() {
    }

    public UserModel(String password2, String contact2) {
        this.password = password2;
        this.contact = contact2;
    }

    public UserModel(String firstname2, String lastname2, String password2, String password_confirmation2, String email2, String dob2, String contact2) {
        this.firstname = firstname2;
        this.lastname = lastname2;
        this.password = password2;
        this.password_confirmation = password_confirmation2;
        this.email = email2;
        this.dob = dob2;
        this.contact = contact2;
    }

    public String getToken() {
        return this.token;
    }

    public String getResponse() {
        return this.response;
    }
}
