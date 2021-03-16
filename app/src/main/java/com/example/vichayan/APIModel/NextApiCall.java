package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NextApiCall {
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("first_page_url")
    @Expose
    private String firstPageUrl;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("next_page_url")
    @Expose
    private Object nextPageUrl;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("prev_page_url")
    @Expose
    private Object prevPageUrl;
    @SerializedName("to")
    @Expose

    /* renamed from: to */
    private Integer f164to;

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(Integer currentPage2) {
        this.currentPage = currentPage2;
    }

    public String getFirstPageUrl() {
        return this.firstPageUrl;
    }

    public void setFirstPageUrl(String firstPageUrl2) {
        this.firstPageUrl = firstPageUrl2;
    }

    public Integer getFrom() {
        return this.from;
    }

    public void setFrom(Integer from2) {
        this.from = from2;
    }

    public Object getNextPageUrl() {
        return this.nextPageUrl;
    }

    public void setNextPageUrl(Object nextPageUrl2) {
        this.nextPageUrl = nextPageUrl2;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path2) {
        this.path = path2;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public void setPerPage(Integer perPage2) {
        this.perPage = perPage2;
    }

    public Object getPrevPageUrl() {
        return this.prevPageUrl;
    }

    public void setPrevPageUrl(Object prevPageUrl2) {
        this.prevPageUrl = prevPageUrl2;
    }

    public Integer getTo() {
        return this.f164to;
    }

    public void setTo(Integer to) {
        this.f164to = to;
    }
}
