package com.example.helloworld.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HS on 2017/3/20.
 */

public class City extends DataSupport {

    private int id;
    private int provinceId;
    private String cityName;
    private int cityCode;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
