package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentData {
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f162id;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("post_id")
    @Expose
    private Integer postId;
    @SerializedName("profilepic")
    @Expose
    private String profilepic;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("user_id")
    @Expose
    private Integer userId;

    public Integer getId() {
        return this.f162id;
    }

    public void setId(Integer id) {
        this.f162id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId2) {
        this.userId = userId2;
    }

    public Integer getPostId() {
        return this.postId;
    }

    public void setPostId(Integer postId2) {
        this.postId = postId2;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment2) {
        this.comment = comment2;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId2) {
        this.parentId = parentId2;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt2) {
        this.createdAt = createdAt2;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt2) {
        this.updatedAt = updatedAt2;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname2) {
        this.firstname = firstname2;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname2) {
        this.lastname = lastname2;
    }

    public String getProfilepic() {
        return this.profilepic;
    }

    public void setProfilepic(String profilepic2) {
        this.profilepic = profilepic2;
    }
}
