package cn.guoxiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by guoxiang on 2017/6/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
