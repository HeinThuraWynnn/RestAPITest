package com.wynnsolution.heinthurawynn.restapi.gmodel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hein Thura Wynn on 4/25/2017.
 */

public class AuthorG {
    @SerializedName("author_id")
    private int author_id;
    @SerializedName("author_name")
    private String author_name;
    @SerializedName("profile_pic")
    private String profile_pic;
    @SerializedName("biography")
    private String biography;

    public int getAuthor_id() {
        return author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public String getBiography() {
        return biography;
    }
}
