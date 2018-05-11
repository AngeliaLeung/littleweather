package com.example.john.littleweather.gson;

/**
 * Created by John on 2018/5/11.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
