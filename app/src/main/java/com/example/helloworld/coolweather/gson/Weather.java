package com.example.helloworld.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HS on 2017/3/30.
 */

public class Weather {
    public AQI aqi;
    public String status;
    public Basic basic;
    public Forecast forecast;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
