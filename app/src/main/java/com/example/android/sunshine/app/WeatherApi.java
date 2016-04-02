package com.example.android.sunshine.app;

import com.example.android.sunshine.app.datamodels.WeatherData;

import java.util.HashMap;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Chirag on 02-04-2016.
 */
public interface WeatherApi {

        @GET("/data/2.5/forecast/daily?")
        Call<WeatherData> getWeatherReport(@QueryMap HashMap<String, String> params);

}
