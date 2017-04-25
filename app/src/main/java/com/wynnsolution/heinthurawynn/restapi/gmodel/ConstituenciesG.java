package com.wynnsolution.heinthurawynn.restapi.gmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Hein Thura Wynn on 4/25/2017.
 */

public class ConstituenciesG {
    @SerializedName("data")
    private List<ConstituencyG> constituencyGs;

    public List<ConstituencyG> getConstituencyGs() {
        return constituencyGs;
    }
}
