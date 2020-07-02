package com.cap.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


}
