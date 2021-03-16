package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserPicResponse {
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("response")
    @Expose
    private Boolean response;

    public Boolean getResponse() {
        return this.response;
    }

    public void setResponse(Boolean response2) {
        this.response = response2;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file2) {
        this.file = file2;
    }
}
