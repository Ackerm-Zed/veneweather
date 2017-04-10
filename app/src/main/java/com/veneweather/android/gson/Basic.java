package com.veneweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/4/10.
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
