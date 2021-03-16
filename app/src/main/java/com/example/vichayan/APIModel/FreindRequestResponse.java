package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FreindRequestResponse {
    @SerializedName("data")
    @Expose
    private List<ShowRequestList> data = null;
    @SerializedName("response")
    @Expose
    private Boolean response;

    public Boolean getResponse() {
        return this.response;
    }

    public void setResponse(Boolean response2) {
        this.response = response2;
    }

    public List<ShowRequestList> getData() {
        return this.data;
    }

    public void setData(List<ShowRequestList> data2) {
        this.data = data2;
    }
}
