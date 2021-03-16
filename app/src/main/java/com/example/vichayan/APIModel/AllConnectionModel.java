package com.example.vichayan.APIModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllConnectionModel {
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
    private String emailVerifiedAt;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private Integer f161id;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("middlename")
    @Expose
    private String middlename;
    @SerializedName("username")
    @Expose
    private String username;

    public Integer getId() {
        return this.f161id;
    }

    public void setId(Integer id) {
        this.f161id = id;
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

    public String getEmailVerifiedAt() {
        return this.emailVerifiedAt;
    }

    public void setEmailVerifiedAt(String emailVerifiedAt2) {
        this.emailVerifiedAt = emailVerifiedAt2;
    }

    public String getMiddlename() {
        return this.middlename;
    }

    public void setMiddlename(String middlename2) {
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
