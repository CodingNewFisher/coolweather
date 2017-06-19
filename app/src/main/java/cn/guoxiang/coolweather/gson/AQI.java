package cn.guoxiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by guoxiang on 2017/6/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }

}
