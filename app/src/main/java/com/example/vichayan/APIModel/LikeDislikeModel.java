package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikeDislikeModel {
    @SerializedName("like")
    @Expose
    private Boolean like;
    @SerializedName("post_id")
    @Expose
    private String postId;

    public LikeDislikeModel() {
    }

    public LikeDislikeModel(String postId2, Boolean like2) {
        this.postId = postId2;
        this.like = like2;
    }

    public String getPostId() {
        return this.postId;
    }

    public void setPostId(String postId2) {
        this.postId = postId2;
    }

    public Boolean getLike() {
        return this.like;
    }

    public void setLike(Boolean like2) {
        this.like = like2;
    }
}
