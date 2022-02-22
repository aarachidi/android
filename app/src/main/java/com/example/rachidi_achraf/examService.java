package com.example.rachidi_achraf;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface examService {
    public static final String apiURL = "https://busin.fr";

    @GET("/drivers.json")
    Call<List<Driver>> listDrivers();

}
