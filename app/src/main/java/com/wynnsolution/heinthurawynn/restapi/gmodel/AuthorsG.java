package com.wynnsolution.heinthurawynn.restapi.gmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Hein Thura Wynn on 4/25/2017.
 */

public class AuthorsG {
    @SerializedName("authors")
    private List<AuthorG> authors;

    public List<AuthorG> getAuthors() {
        return authors;
    }
}
