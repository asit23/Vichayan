package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostContent {
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("postId")
    @Expose
    private Integer postId;

    public Integer getPostId() {
        return this.postId;
    }

    public void setPostId(Integer postId2) {
        this.postId = postId2;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content2) {
        this.content = content2;
    }
}
