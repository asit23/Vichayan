package com.example.vichayan.APIModel;

public class ShowLikedRequest {
    private String post_id;

    public ShowLikedRequest() {
    }

    public ShowLikedRequest(String post_id2) {
        this.post_id = post_id2;
    }

    public String getPost_id() {
        return this.post_id;
    }

    public void setPost_id(String post_id2) {
        this.post_id = post_id2;
    }
}
