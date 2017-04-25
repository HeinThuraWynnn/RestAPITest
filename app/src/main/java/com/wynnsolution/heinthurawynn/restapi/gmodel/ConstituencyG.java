package com.wynnsolution.heinthurawynn.restapi.gmodel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hein Thura Wynn on 4/25/2017.
 */

public class ConstituencyG {
    @SerializedName("_id")
    private String _id;
    @SerializedName("am_constituency")
    private String am_constituency;
    @SerializedName("am_constituency_no")
    private int am_constituency_no;
    @SerializedName("township_name")
    private String township_name;
    @SerializedName("ward_village")
    private String ward_village;
    @SerializedName("township_pcode")
    private String township_pcode;
    @SerializedName("region_pcode")
    private String region_pcode;
    @SerializedName("AM_PCODE")
    private String AM_PCODE;

    public String get_id() {
        return _id;
    }

    public String getAm_constituency() {
        return am_constituency;
    }

    public int getAm_constituency_no() { return am_constituency_no; }

    public String getTownship_name() {
        return township_name;
    }

    public String getWard_village() {
        return ward_village;
    }

    public String getTownship_pcode() { return township_pcode; }

    public String getRegion_pcode() {
        return region_pcode;
    }

    public String getAM_PCODE() {
        return AM_PCODE;
    }


}
