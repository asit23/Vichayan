package com.example.vichayan.APIModel;

public class Posts {
    int contentAttached;
    String content_url;
    int isPublished;
    String message;
    int postStatus;
    int privacy;
    String response;

    public Posts(String message2, int contentAttached2, int isPublished2, int privacy2, int postStatus2) {
        this.message = message2;
        this.contentAttached = contentAttached2;
        this.isPublished = isPublished2;
        this.privacy = privacy2;
        this.postStatus = postStatus2;
    }

    public Posts(String message2, int isPublished2, int privacy2, int postStatus2) {
        this.message = message2;
        this.isPublished = isPublished2;
        this.privacy = privacy2;
        this.postStatus = postStatus2;
    }

    public Posts(String message2, String content_url2, int contentAttached2, int isPublished2, int privacy2, int postStatus2) {
        this.message = message2;
        this.content_url = content_url2;
        this.contentAttached = contentAttached2;
        this.isPublished = isPublished2;
        this.privacy = privacy2;
        this.postStatus = postStatus2;
    }

    public Posts() {
    }

    public String getResponse() {
        return this.response;
    }
}
