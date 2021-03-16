package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearhResponse {
    @SerializedName("data")
    @Expose
    private List<SearchDataList> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private Boolean response;

    public Boolean getResponse() {
        return this.response;
    }

    public void setResponse(Boolean response2) {
        this.response = response2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public List<SearchDataList> getData() {
        return this.data;
    }

    public void setData(List<SearchDataList> data2) {
        this.data = data2;
    }
}
