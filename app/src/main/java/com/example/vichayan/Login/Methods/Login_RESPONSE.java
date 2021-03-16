package com.example.vichayan.Login.Methods;


import com.example.vichayan.APIModel.UserModel;

public class Login_RESPONSE {
    private UserModel data;
    private String response;
    private String token;

    public Login_RESPONSE() {
    }

    public Login_RESPONSE(String response2, String token2, UserModel data2) {
        this.response = response2;
        this.token = token2;
        this.data = data2;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response2) {
        this.response = response2;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token2) {
        this.token = token2;
    }

    public UserModel getData() {
        return this.data;
    }

    public void setData(UserModel data2) {
        this.data = data2;
    }
}
