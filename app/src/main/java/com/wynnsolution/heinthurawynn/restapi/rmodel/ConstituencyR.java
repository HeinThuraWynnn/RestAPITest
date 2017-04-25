package com.wynnsolution.heinthurawynn.restapi.rmodel;

import io.realm.RealmObject;

/**
 * Created by Hein Thura Wynn on 4/25/2017.
 */

public class ConstituencyR extends RealmObject{
    private String _id;
    private String am_constituency;
    private int am_constituency_no;
    private String township_name;
    private String ward_village;
    private String township_pcode;
    private String region_pcode;
    private String AM_PCODE;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAm_constituency() {
        return am_constituency;
    }

    public void setAm_constituency(String am_constituency) {
        this.am_constituency = am_constituency;
    }

    public int getAm_constituency_no() {
        return am_constituency_no;
    }

    public void setAm_constituency_no(int am_constituency_no) {
        this.am_constituency_no = am_constituency_no;
    }

    public String getTownship_name() {
        return township_name;
    }

    public void setTownship_name(String township_name) {
        this.township_name = township_name;
    }

    public String getWard_village() {
        return ward_village;
    }

    public void setWard_village(String ward_village) {
        this.ward_village = ward_village;
    }

    public String getTownship_pcode() {
        return township_pcode;
    }

    public void setTownship_pcode(String township_pcode) {
        this.township_pcode = township_pcode;
    }

    public String getRegion_pcode() {
        return region_pcode;
    }

    public void setRegion_pcode(String region_pcode) {
        this.region_pcode = region_pcode;
    }

    public String getAM_PCODE() {
        return AM_PCODE;
    }

    public void setAM_PCODE(String AM_PCODE) {
        this.AM_PCODE = AM_PCODE;
    }
}
