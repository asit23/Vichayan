package com.example.vichayan.APIModel;

public class RespondRequest {
    private Integer friends_id;
    private Integer response;

    public RespondRequest(Integer friends_id2, Integer response2) {
        this.friends_id = friends_id2;
        this.response = response2;
    }

    public Integer getFriends_id() {
        return this.friends_id;
    }

    public void setFriends_id(Integer friends_id2) {
        this.friends_id = friends_id2;
    }

    public Integer getResponse() {
        return this.response;
    }

    public void setResponse(Integer response2) {
        this.response = response2;
    }
}
