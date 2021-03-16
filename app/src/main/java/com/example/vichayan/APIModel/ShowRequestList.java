package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShowRequestList {
    @SerializedName("active_profile_image")
    @Expose
    private String activeProfileImage;
    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("email_verified_at")
    @Expose
    private Object emailVerifiedAt;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f167id;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("middlename")
    @Expose
    private Object middlename;
    @SerializedName("username")
    @Expose
    private String username;

    public Integer getId() {
        return this.f167id;
    }

    public void setId(Integer id) {
        this.f167id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname2) {
        this.firstname = firstname2;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email2) {
        this.email = email2;
    }

    public Object getEmailVerifiedAt() {
        return this.emailVerifiedAt;
    }

    public void setEmailVerifiedAt(Object emailVerifiedAt2) {
        this.emailVerifiedAt = emailVerifiedAt2;
    }

    public Object getMiddlename() {
        return this.middlename;
    }

    public void setMiddlename(Object middlename2) {
        this.middlename = middlename2;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname2) {
        this.lastname = lastname2;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact2) {
        this.contact = contact2;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob2) {
        this.dob = dob2;
    }

    public String getActiveProfileImage() {
        return this.activeProfileImage;
    }

    public void setActiveProfileImage(String activeProfileImage2) {
        this.activeProfileImage = activeProfileImage2;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username2) {
        this.username = username2;
    }
}
