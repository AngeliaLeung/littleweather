package com.example.john.littleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by John on 2018/5/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
