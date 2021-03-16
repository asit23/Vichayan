package com.example.vichayan.Model;

public class HomePageModel {
    public static final int POST_VIEW = 1;
    public static final int STORY_VIEW = 0;
    private int type;

    public HomePageModel(int type2) {
        this.type = type2;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type2) {
        this.type = type2;
    }

    public HomePageModel() {
    }
}
