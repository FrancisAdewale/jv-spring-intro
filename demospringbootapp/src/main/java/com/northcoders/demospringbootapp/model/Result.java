package com.northcoders.demospringbootapp.model;
import java.util.*;
public class Result{
    public int id;
    public String name;
    public double latitude;
    public double longitude;
    public double elevation;
    public String feature_code;
    public String country_code;
    public int admin1_id;
    public int admin3_id;
    public int admin4_id;
    public String timezone;
    public int population;
    public ArrayList<String> postcodes;
    public int country_id;
    public String country;
    public String admin1;
    public String admin3;
    public String admin4;
    public int admin2_id;
    public String admin2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}



