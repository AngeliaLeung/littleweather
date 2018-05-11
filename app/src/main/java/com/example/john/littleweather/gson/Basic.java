package com.example.john.littleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by John on 2018/5/11.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
