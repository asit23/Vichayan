package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FreindRequest {
    @SerializedName("friend_id")
    @Expose
    private Integer friendId;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private Boolean response;

    public FreindRequest() {
    }

    public FreindRequest(Integer friendId2) {
        this.friendId = friendId2;
    }

    public Boolean getResponse() {
        return this.response;
    }

    public void setResponse(Boolean response2) {
        this.response = response2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public Integer getFriendId() {
        return this.friendId;
    }

    public void setFriendId(Integer friendId2) {
        this.friendId = friendId2;
    }
}
