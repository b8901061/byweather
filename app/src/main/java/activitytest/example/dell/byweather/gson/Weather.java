package activitytest.example.dell.byweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dell on 2017/8/2.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
