package com.example.rachidi_achraf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    List<Driver> drivers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        examService service = new Retrofit.Builder()
                .baseUrl(examService.apiURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(examService.class);

        service.listDrivers().enqueue(new Callback<List<Driver>>() {
            @Override
            public void onResponse(Call<List<Driver>> call, Response<List<Driver>> response) {
                RecyclerView rvDriver = (RecyclerView) findViewById(R.id.rvDrivers);
                drivers = response.body();

                DriverAdapter adapter = new DriverAdapter(drivers);
                rvDriver.setAdapter(adapter);

                rvDriver.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }

            @Override
            public void onFailure(Call<List<Driver>> call, Throwable t) {

            }
        });
    }
}