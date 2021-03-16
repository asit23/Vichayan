package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IsLiked {
    @SerializedName("isActive")
    @Expose
    private Integer isActive;

    public Integer getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Integer isActive2) {
        this.isActive = isActive2;
    }
}
