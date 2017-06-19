package cn.guoxiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by guoxiang on 2017/6/19.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfortable;
    @SerializedName("cw")
    public CardWash cardWash;
    @SerializedName("sport")
    public Sport sport;

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
    public class CardWash{
        @SerializedName("txt")
        public String info;
    }
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
}
