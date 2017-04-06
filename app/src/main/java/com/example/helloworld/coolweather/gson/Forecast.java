package com.example.helloworld.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HS on 2017/3/30.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temprature;

    @SerializedName("cond")
    public More More;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
    public class Temperature{
        public String max;
        public String min;
    }
}
