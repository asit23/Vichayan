package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentLikeRequest {
    @SerializedName("comment_id")
    @Expose
    private Integer commentId;
    @SerializedName("isLiked")
    @Expose
    private Boolean isLiked;

    public CommentLikeRequest(Integer commentId2, Boolean isLiked2) {
        this.commentId = commentId2;
        this.isLiked = isLiked2;
    }

    public Integer getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Integer commentId2) {
        this.commentId = commentId2;
    }

    public Boolean getIsLiked() {
        return this.isLiked;
    }

    public void setIsLiked(Boolean isLiked2) {
        this.isLiked = isLiked2;
    }
}
