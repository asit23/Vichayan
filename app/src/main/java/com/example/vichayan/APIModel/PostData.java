package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PostData {
    @SerializedName("comment")
    @Expose
    private List<CommentData> comment = null;
    @SerializedName("commentCount")
    @Expose
    private Integer commentCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("isContentAttached")
    @Expose
    private Integer isContentAttached;
    @SerializedName("isLiked")
    @Expose
    private List<IsLiked> isLiked = null;
    @SerializedName("likeCount")
    @Expose
    private Integer likeCount;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("postContent")
    @Expose
    private List<PostContent> postContent = null;
    @SerializedName("postId")
    @Expose
    private String postId;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("profilePic")
    @Expose
    private String profilePic;
    @SerializedName("shareCount")
    @Expose
    private Integer shareCount;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("username")
    @Expose
    private String username;

    public String getPostId() {
        return this.postId;
    }

    public void setPostId(String postId2) {
        this.postId = postId2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId2) {
        this.userId = userId2;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username2) {
        this.username = username2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName2) {
        this.shortName = shortName2;
    }

    public String getProfilePic() {
        return this.profilePic;
    }

    public void setProfilePic(String profilePic2) {
        this.profilePic = profilePic2;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public void setLikeCount(Integer likeCount2) {
        this.likeCount = likeCount2;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount2) {
        this.commentCount = commentCount2;
    }

    public Integer getShareCount() {
        return this.shareCount;
    }

    public void setShareCount(Integer shareCount2) {
        this.shareCount = shareCount2;
    }

    public String getPrivacy() {
        return this.privacy;
    }

    public void setPrivacy(String privacy2) {
        this.privacy = privacy2;
    }

    public Integer getIsContentAttached() {
        return this.isContentAttached;
    }

    public void setIsContentAttached(Integer isContentAttached2) {
        this.isContentAttached = isContentAttached2;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt2) {
        this.createdAt = createdAt2;
    }

    public List<PostContent> getPostContent() {
        return this.postContent;
    }

    public void setPostContent(List<PostContent> postContent2) {
        this.postContent = postContent2;
    }

    public List<CommentData> getComment() {
        return this.comment;
    }

    public void setComment(List<CommentData> comment2) {
        this.comment = comment2;
    }

    public List<IsLiked> getIsLiked() {
        return this.isLiked;
    }

    public void setIsLiked(List<IsLiked> isLiked2) {
        this.isLiked = isLiked2;
    }
}
