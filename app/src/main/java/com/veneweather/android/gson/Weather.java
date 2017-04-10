package com.veneweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2017/4/10.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    public Forecast forecast;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    
}
