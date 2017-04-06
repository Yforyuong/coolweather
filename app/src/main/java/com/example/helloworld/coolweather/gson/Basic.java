package com.example.helloworld.coolweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Created by HS on 2017/3/30.
 */

public class Basic {
    @SerializedName("city")             //注解使JSON字段和Java字段进行连接
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

