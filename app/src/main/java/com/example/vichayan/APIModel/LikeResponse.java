package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LikeResponse {
    @SerializedName("data")
    @Expose
    private List<ShowLikedResponse> data = null;
    @SerializedName("response")
    @Expose
    private Boolean response;

    public Boolean getResponse() {
        return this.response;
    }

    public void setResponse(Boolean response2) {
        this.response = response2;
    }

    public List<ShowLikedResponse> getData() {
        return this.data;
    }

    public void setData(List<ShowLikedResponse> data2) {
        this.data = data2;
    }
}
