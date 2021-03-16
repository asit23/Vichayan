package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PostModelResponse {
    @SerializedName("data")
    @Expose
    private List<PostData> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    private NextApiCall nextApiCall;
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

    public List<PostData> getData() {
        return this.data;
    }

    public void setData(List<PostData> data2) {
        this.data = data2;
    }

    public NextApiCall getNextApiCall() {
        return this.nextApiCall;
    }

    public void setNextApiCall(NextApiCall nextApiCall2) {
        this.nextApiCall = nextApiCall2;
    }
}
