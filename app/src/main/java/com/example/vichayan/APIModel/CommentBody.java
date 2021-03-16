package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentBody {
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("post_id")
    @Expose
    private String postId;

    public CommentBody(String postId2, String comment2) {
        this.postId = postId2;
        this.comment = comment2;
    }

    public CommentBody() {
    }

    public String getPostId() {
        return this.postId;
    }

    public void setPostId(String postId2) {
        this.postId = postId2;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment2) {
        this.comment = comment2;
    }
}
