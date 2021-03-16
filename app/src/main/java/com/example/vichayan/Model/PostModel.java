package com.example.vichayan.Model;

public class PostModel {
    private String cmnttxt;
    private String desc;
    private String imageurl;
    private String isLiked;
    private String likestxt;
    private String time;
    private String username;
    private String userpic;

    public PostModel(String userpic2, String username2, String time2, String desc2, String imageurl2, String likestxt2, String cmnttxt2, String isLiked2) {
        this.userpic = userpic2;
        this.username = username2;
        this.time = time2;
        this.desc = desc2;
        this.imageurl = imageurl2;
        this.likestxt = likestxt2;
        this.cmnttxt = cmnttxt2;
        this.isLiked = isLiked2;
    }

    public PostModel() {
    }

    public String getUserpic() {
        return this.userpic;
    }

    public void setUserpic(String userpic2) {
        this.userpic = userpic2;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username2) {
        this.username = username2;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time2) {
        this.time = time2;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc2) {
        this.desc = desc2;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl2) {
        this.imageurl = imageurl2;
    }

    public String getLikestxt() {
        return this.likestxt;
    }

    public void setLikestxt(String likestxt2) {
        this.likestxt = likestxt2;
    }

    public String getCmnttxt() {
        return this.cmnttxt;
    }

    public void setCmnttxt(String cmnttxt2) {
        this.cmnttxt = cmnttxt2;
    }

    public String getIsLiked() {
        return this.isLiked;
    }

    public void setIsLiked(String isLiked2) {
        this.isLiked = isLiked2;
    }
}
