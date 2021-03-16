package com.example.vichayan.Login.Methods;


import com.example.vichayan.APIModel.UserModel;

public class SignUp_RESPONSE {
    private String token;
    private UserModel user;

    public SignUp_RESPONSE() {
    }

    public SignUp_RESPONSE(String token2, UserModel user2) {
        this.token = token2;
        this.user = user2;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token2) {
        this.token = token2;
    }

    public UserModel getUser() {
        return this.user;
    }

    public void setUser(UserModel user2) {
        this.user = user2;
    }
}
