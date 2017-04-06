package com.example.helloworld.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HS on 2017/3/30.
 */

public class Now {

    @SerializedName("tmp")
    public String temerature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
